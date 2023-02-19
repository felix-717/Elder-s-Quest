import javafx.scene.control.Label;

import javafx.scene.layout.GridPane;



public class Player extends gameFunctions{
    double criticalMultiplier = 1.75;
    double ineffectiveMultiplier = 0.75;
    String name;
    double hp;
    int dmg;
    int potionCnt=3;
    int[] missChance;
    int[] missFrequency;



    //constructor
    public Player(String username, String difficulty) {

        name = username;
        hp = 1500;
        dmg = 50;
    }


    /**
     * player does an attack
     *
     * @param weapon     nam eof weapon used
     * @param quest      Monster
     * @param nameDialog name Dialog
     * @param bodyDialog  body dialog
     * @return returns damage done
     */
    public double attack(String weapon, String quest, Label bodyDialog, Label nameDialog, GridPane canvas) {

        if (weapon.equals("potion")) {
            playMusic("assets/drink.mp3",canvas);
            if(potionCnt !=0){
                hp  = hp+50;
                bodyDialog.setText("Your Health is now: " + hp);
                potionCnt--;
                //return -1 if potion use
                return 0;
            }else{
                bodyDialog.setText("You have no more potions!!");
                return 0;
            }
        }


        //miss chance
        System.out.println("Weapon is " + weapon +"\nMonster is " + quest);
        switch (quest) {
            case "lyngruel" -> {
                missChance = new int[]{0, 1};
                missFrequency = new int[]{20, 80};
            }
            case "forrek" -> {
                missChance = new int[]{0, 1};
                missFrequency = new int[]{30, 70};
            }
            case "merl" -> {
                missChance = new int[]{0, 1};
                missFrequency = new int[]{50, 50};
            }
            case "azazel" -> {
                missChance = new int[]{0, 1};
                missFrequency = new int[]{60, 40};
            }
        }


        //probability for attack missed
        Probability probObj = new Probability();
        double missResult =  probObj.getProbability(missChance,missFrequency);

        if(missResult ==0){
            bodyDialog.setText(name + " has missed!!");
        }
        else{
            nameDialog.setText("");

            switch (weapon) {
                case "sword" -> {
                    playMusic("assets/sword.mp3", canvas);
                    if (quest.equals("lyngruel")) {
                        bodyDialog.setText("Attack Effective!! You have dealt " + dmg * criticalMultiplier);
                    } else {
                        bodyDialog.setText("Attack Ineffective!! You have dealt " + dmg * ineffectiveMultiplier);
                    }
                    return dmg * criticalMultiplier;
                }
                case "axe" -> {
                    playMusic("assets/axe.mp3", canvas);
                    if (quest.equals("forrek")) {
                        bodyDialog.setText("Attack Effective!! You have dealt " + dmg * criticalMultiplier);
                    } else {
                        bodyDialog.setText("Attack Ineffective!! You have dealt " + dmg * ineffectiveMultiplier);
                    }
                    return dmg * criticalMultiplier;
                }
                case "spear" -> {
                    playMusic("assets/spear.mp3", canvas);
                    if (quest.equals("merl")) {
                        bodyDialog.setText("Attack Effective!! You have dealt " + dmg * criticalMultiplier);
                    } else {
                        bodyDialog.setText("Attack Ineffective!! You have dealt " + dmg * ineffectiveMultiplier);
                    }
                    return dmg * criticalMultiplier;
                }
                case "bow" -> {
                    playMusic("assets/bow.mp3", canvas);
                    if (quest.equals("yaphets")) {
                        bodyDialog.setText("Attack Effective!! You have dealt " + dmg * criticalMultiplier);
                    } else {
                        bodyDialog.setText("Attack Ineffective!! You have dealt " + dmg * ineffectiveMultiplier);
                    }
                    return dmg * criticalMultiplier;
                }
            }

            return 0;
        }



        return 0 ;

    }}

//    /**
//     * Plays music and returns mediaPlyer
//     *
//     * @param musicPath - string path of music
//     * @return Mediaplayer for string
//     */
//    public MediaPlayer playMusic(String musicPath, GridPane canvas) {
//        File musicFile = new File(musicPath);// For example
//
//        Media sound = new Media(musicFile.toURI().toString());
//        MediaPlayer mediaPlayer = new MediaPlayer(sound);
//        mediaPlayer.play();
//
//
//        MediaView mediaView = new MediaView(mediaPlayer);
//        canvas.getChildren().add(mediaView);
//
//        return mediaPlayer;
//
//    }
//}
