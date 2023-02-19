import javafx.animation.*;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.concurrent.TimeUnit;


public class Controller extends gameFunctions{

    public ImageView imgView;
    public ImageView monsterImgView = new ImageView();
    public GridPane canvas;
    public Label nameDialog;
    public Label bodyDialog;
    public AnchorPane firstPane;
    public Button gotoRW;
    public Button gotoFR;
    public Button gotoOWT;
    public Button gotoHH;
    public Button longSwordBtn;
    public Button switchAxeBtn;
    public Button spearBtn;
    public Button warBowBtn;
    public Button potionBtn;
    public String difficulty = "difficulty";
    public Label userStats = new Label();
    public Label monsterStats = new Label();
    public MediaPlayer battleMusic;
    Player player;
//    lyngruel lyngruel;
    Monster currentMonster;



//    MediaPlayer mediaPlayer;
    String userName;

    String currentQuest = "lyngruel";
    int chances = 2;
    private MediaPlayer ambient;


    public void initialize()  {

//        outro outro =new outro();
//        outro.startOutro(nameDialog,bodyDialog,imgView,canvas,firstPane);

        ambient = playMusic("assets/ambient.mp3", canvas);
        ambient.pause();
        TextInputDialog textinput = new TextInputDialog();
        Stage stage = (Stage) textinput.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image("file:assets/dragon.png")); // To add an icon
        textinput.setTitle("Enter name");

        textinput.setHeaderText("Enter your name ");

        textinput.showAndWait();

        textinput.getDialogPane().setContentText("Enter name:");
        TextField input = textinput.getEditor();

        if (input.getText() != null) {
            userName = input.getText();
            System.out.println("User is " + userName);

        } else {
            System.out.println("no input");
        }


        intro obj = new intro();
        /*MediaPlayer introMusic =*/ playMusic("assets/intro.mp3", canvas);
        obj.addImage("file:assets/forest.jpg", imgView);
        obj.startIntro(nameDialog, bodyDialog, imgView, canvas, userName);

//        //open the map
//        addImage("file:assets/map.jpg",imgView);


        createButtonsForMap(firstPane);


    }

    /**
     * Creates a button with text and returns a button
     *
     * @param btnText  String label
     * @param family   String font name
     * @param textSize font size
     * @param x        layout x
     * @param y        layout y
     * @return Button
     */
    public Button createButton(String btnText, String family, int textSize, int x, int y) {
        Button btn = new Button(btnText);
        Font font = new Font(family, textSize);
        btn.setFont(font);
        btn.setLayoutX(x);
        btn.setLayoutY(y);
        return btn;

    }

    /**
     * Creates a button with image
     *
     * @param path string path for image
     * @param x    Location x
     * @param y    Location Y
     * @return return button with image
     */
    public Button createButton(String path, int x, int y, int width, int height) {
        Image img = new Image(path);
        ImageView view = new ImageView(img);
        view.setFitHeight(height);
        view.setFitWidth(width);
        Button btn = new Button();
        btn.setGraphic(view);
        btn.setLayoutX(x);
        btn.setLayoutY(y);
        btn.setMaxWidth(width);
        btn.setMaxHeight(height);
        return btn;

    }

    /**
     * Adds goto buttons to the map
     *  @param firstPane canvas
     *
     */
    private void createButtonsForMap(AnchorPane firstPane) {

        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(170));
        pauseTransition.setOnFinished(e -> {

            gotoFR = createButton("Flooded Ruins", "Centaur", 12, 613, 282);
            gotoHH = createButton("Highland Hills", "Centaur", 12, 280, 416);
            gotoOWT = createButton("Old Witch's Tower", "Centaur", 12, 878, 473);
            gotoRW = createButton("Ragged Wood", "Centaur", 12, 769, 47);
            gotoFR.setOnAction((actionEvent -> checkButton("flooded ruins")));
            gotoHH.setOnAction((actionEvent -> checkButton("highland hills")));
            gotoOWT.setOnAction((actionEvent -> checkButton("old witches tower")));
            gotoRW.setOnAction((actionEvent -> checkButton("ragged wood")));


            Group btnGroup = new Group();
            btnGroup.getChildren().addAll(gotoFR, gotoOWT, gotoHH, gotoRW);


            firstPane.getChildren().add(btnGroup);

        });
        pauseTransition.play();


    }

    private void checkButton(String location) {
        System.out.println("Current quest is  " + currentQuest + "Location is " + location);


        switch (currentQuest) {
            case "lyngruel":
                if (location.equals("ragged wood")) {
                    bodyDialog.setText("What are you doing here??\nHow did you find me?");
                    nameDialog.setText("Lyngruel The Giant");
                    startLyngruelBattle();
                } else {
                    bodyDialog.setText("\"Lyngruel is not there! Choose again before he escapes! You have " + (chances - 1) + " more chance(s)!\"");
                    nameDialog.setText("");
                    chances--;
                    if (chances == 0) {
                        gameOver();
                    }

                }
                break;
            case "forrek":
                if (location.equals("flooded ruins")) {
                    bodyDialog.setText("These are the flooded ruins. No one should be allowed here!\nState your business!");
                    nameDialog.setText("Forrek");
                    startForrekBattle();
                } else {
                    bodyDialog.setText("\"Forrek is not there! Choose again before he escapes! You have " + (chances - 1) + " more chance(s)!\"");
                    nameDialog.setText("");
                    chances--;
                    if (chances == 0) {
                        gameOver();
                    }

                }
                break;
            case "merl":
                if (location.equals("old witches tower")) {
                    bodyDialog.setText("I have awaited your arrival Hunter " + userName);
                    nameDialog.setText("Merl the Wizard");
                    startMerlBattle();
                } else {
                    bodyDialog.setText("\"Merl is not there! Choose again before he escapes! You have " + (chances - 1) + " more chance(s)!\"");
                    nameDialog.setText("");
                    chances--;
                    if (chances == 0) {
                        gameOver();
                    }

                }
                break;
            case "yaphets":
                if (location.equals("highland hills")) {
                    bodyDialog.setText(".......");
                    nameDialog.setText("Yaphets the Demon");
                    startYaphetsBattle();
                } else {
                    bodyDialog.setText("\"Merl is not there! Choose again before he escapes! You have " + (chances - 1) + " more chance(s)!\"");
                    nameDialog.setText("");
                    chances--;
                    if (chances == 0) {
                        gameOver();
                    }

                }
                break;
        }


    }

    private void startYaphetsBattle() {

        musicFadeOut(ambient);

        System.out.println("entered yaphets battle ");


        //play battle music
        battleMusic = playMusic("assets/battle4.mp3", canvas);
        //create objects

        currentMonster  = new yaphets(difficulty);

        setStatLabel(player, currentMonster);



        fadeInImage(imgView, "file:assets/bg4.jpg", 5);

        setMapButtonVisibility(false);
        //monsterimgview visibility check?
        monsterImgView.setVisible(true);
        fadeInImage(monsterImgView, "file:assets/yaphets.png", 5);
        setStatLabelVisibility(true);






        setAttackButtonVisibility(true);

    }

    /**
     * Start merl battle
     */
    private void startMerlBattle() {

        musicFadeOut(ambient);

        System.out.println("entered merl battle ");


        //play battle music
        battleMusic = playMusic("assets/battle3.mp3", canvas);
        //create objects

        currentMonster  = new merl(difficulty);

        setStatLabel(player, currentMonster);


        fadeInImage(imgView, "file:assets/bg3.jpg", 5);

        setMapButtonVisibility(false);
        //monsterimgview visibility check?
        monsterImgView.setVisible(true);
        fadeInImage(monsterImgView, "file:assets/merl.png", 5);
        setStatLabelVisibility(true);


        setAttackButtonVisibility(true);

    }

    /**
     * Starts battle with forrek
     */
    private void startForrekBattle() {
        musicFadeOut(ambient);

        System.out.println("entered forrek battle ");


        //play battle music
        battleMusic = playMusic("assets/battle2.mp3", canvas);
        //create objects

        currentMonster  = new forrek(difficulty);

        setStatLabel(player, currentMonster);



        fadeInImage(imgView, "file:assets/bg2.jpg", 5);
//        bodyDialog.setText("You have found Forrek the Orc!!");
        setMapButtonVisibility(false);
        //monsterimgview visibility check?
        monsterImgView.setVisible(true);
        fadeInImage(monsterImgView, "file:assets/forrek.png", 5);
        setStatLabelVisibility(true);

//        startDialogLinesWithName(bodyDialog, nameDialog, monsterDialog, name, 1, 1, 1);

        setAttackButtonVisibility(true);


    }


    /**
     * Starts Lygruel battle
     */
    private void startLyngruelBattle() {

        //play battle music
        battleMusic = playMusic("assets/battle1.mp3", canvas);
        //create objects
        player = new Player(userName, difficulty);
        currentMonster = new lyngruel(difficulty);

                setStatLabel(player, currentMonster);

        fadeInImage(imgView, "file:assets/bg1.jpg", 5);

        setMapButtonVisibility(false);
        monsterImgView.setLayoutX(347);
        monsterImgView.setLayoutY(95);
        monsterImgView.setFitWidth(305);
        monsterImgView.setFitHeight(427);

        firstPane.getChildren().add(monsterImgView);
        fadeInImage(monsterImgView, "file:assets/lyngruel.png", 5);


        createAttackButtons(player);


    }

    /**
     * Creates stats Label during fights
     *
     * @param player  player obj
     * @param monster monster obj
     */
    private void setStatLabel(Player player, Monster monster) {
        monsterStats.setText(monster.name +
                "\nHP: " + monster.hp +
                "\nDMG: " + monster.dmg);
        monsterStats.setLayoutY(79);
        monsterStats.setLayoutX(28);


        userStats.setText(player.name +
                "\nHP: " + player.hp +
                "\nDMG: " + player.dmg +
                "\nPotions: " + player.potionCnt);

        userStats.setLayoutX(769);
        userStats.setLayoutY(265);
        Font font = new Font("Centaur", 20);
        userStats.setFont(font);
        monsterStats.setFont(font);
        userStats.setTextFill(Color.WHITE);
        monsterStats.setTextFill(Color.WHITE);

        Group stats = new Group();
        stats.getChildren().addAll(userStats, monsterStats);

        firstPane.getChildren().addAll(userStats, monsterStats);


    }

    /**
     * Creates the attack Buttons
     *
     * @param player  player obj
     */
    private void createAttackButtons(Player player) {
        longSwordBtn = createButton("file:assets/sword.png", 766, 384, 66, 66);
        switchAxeBtn = createButton("file:assets/axe.png", 847, 384, 66, 66);
        spearBtn = createButton("file:assets/spear.png", 766, 457, 66, 66);
        warBowBtn = createButton("file:assets/bow.png", 847, 457, 66, 66);
        potionBtn = createButton("file:assets/potion.png", 808, 525, 49, 56);

        longSwordBtn.setShape(new Circle(1.75));
        switchAxeBtn.setShape(new Circle(1.75));
        spearBtn.setShape(new Circle(1.75));
        warBowBtn.setShape(new Circle(1.75));
        potionBtn.setShape(new Circle(1.75));


        longSwordBtn.setOnAction((actionEvent -> checkAttack("sword", player, currentMonster)));
        switchAxeBtn.setOnAction((actionEvent -> checkAttack("axe", player, currentMonster)));
        spearBtn.setOnAction(actionEvent -> checkAttack("spear", player, currentMonster));
        warBowBtn.setOnAction((actionEvent -> checkAttack("bow", player, currentMonster)));
        potionBtn.setOnAction((actionEvent -> checkAttack("potion", player, currentMonster)));


        Group attackBtnGroup = new Group();
        attackBtnGroup.getChildren().addAll(longSwordBtn, switchAxeBtn, spearBtn, warBowBtn, potionBtn);


        firstPane.getChildren().add(attackBtnGroup);

    }

    /**
     * Checks attack button
     *
     * @param attack  String of attack
     * @param player  Player Object
     * @param monster monster object
     */
    private void checkAttack(String attack, Player player, Monster monster) {
        nameDialog.setText("");
        setDisableAttackButtons(true);
        //user attack
        double damage = player.attack(attack, currentQuest, bodyDialog, nameDialog, canvas);
        if (damage != 0) {
            monster.hp = monster.hp - damage;
        }
        //update label
        setStatLabel(player, monster);


        //pause transition for monster attack
        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(2));
        pauseTransition.setOnFinished(e -> {

            System.out.println("Entered monster attack");
            double monsterDmg = monster.attack(canvas);
            System.out.println("Monster dmg is " + monsterDmg);
            player.hp = player.hp - monsterDmg;
            bodyDialog.setText(currentQuest + " has dealt " + monsterDmg + " damage!!");
            setStatLabel(player, monster);
            setDisableAttackButtons(false);

            //check if one has died
            if (player.hp < 0 || player.hp == 0) {
                bodyDialog.setText("Player has died!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
//                gameOver();
                musicFadeOut(battleMusic);
                player.hp = 2000;
                backToMenu(10);
            } else if (monster.hp < 0 || monster.hp == 0) {
                bodyDialog.setText("You have killed " + currentQuest + "!!");
                System.out.println("End");

                musicFadeOut(battleMusic);
                //updates the quest
                switch (currentQuest) {
                    case "lyngruel" -> {
                        gotoRW.setDisable(true);
                        playMusic("assets/monster1.mp3", canvas);
                        backToMenu(33);
                        startSecondQuest();
                    }
                    case "forrek" -> {
                        gotoFR.setDisable(true);
                        playMusic("assets/monster2.mp3", canvas);
                        backToMenu(33);
                        startThirdQuest();
                    }
                    case "merl" -> {
                        gotoOWT.setDisable(true);
                        playMusic("assets/monster3.mp3", canvas);
                        backToMenu(33);
                        startLastQuest();
                    }
                    case "yaphets" -> {
                        gotoOWT.setDisable(true);
                        playMusic("assets/monster4.mp3", canvas);

                        PauseTransition pauseTransition2 = new PauseTransition(Duration.seconds(3));
                        pauseTransition2.setOnFinished(event -> end());
                        pauseTransition2.play();

                    }
                }

            }
        });
        pauseTransition.play();

    }

    private void end() {
        //hide gameplay objects(monster, attack buttons,stats label )
        monsterImgView.setVisible(false);
        setAttackButtonVisibility(false);
        setStatLabelVisibility(false);

        outro outro = new outro();
        outro.startOutro(nameDialog, bodyDialog, imgView, canvas, firstPane);
    }

    /**
     * Disable attack buttons
     */
    private void setDisableAttackButtons(boolean b) {

        potionBtn.setDisable(b);
        warBowBtn.setDisable(b);
        spearBtn.setDisable(b);
        switchAxeBtn.setDisable(b);
        longSwordBtn.setDisable(b);
    }

    private void startLastQuest() {
        currentQuest = "yaphets";
        String[] body = {

                "You take a look at the Last quest information.\nYaphets the Demon\nHP: 500, DMG:50",
                "Yaphets was said to be the fastest warrior during his time. However this is because he sold his \nsoul to Lucifer himself." +
                        "\nHe now roams randomly in search of souls to eat.",
                "Yaphets is a terrifying demon that resembles a shadow."


        };
        String[] name = {
                "", "", ""
        };
        startDialogLinesWithName(bodyDialog, nameDialog, body, name, 3, 5, 2);

    }

    private void startThirdQuest() {
        currentQuest = "merl";
        String[] body = {

                "You take a look at the Third quest information.\nMerl the Wizard\nHP: 300, DMG:50",
                "Merl is an Experienced Wizard who worked for the King of Grasslake. However \nbecause of greed Merl tried to kill the king." +
                        "\nHis plan failed and decided to go rogue.",
                "Merl wears a magical robe that help resists melee attacks and uses the staff of damnation."


        };
        String[] name = {
                "", "", ""
        };
        startDialogLinesWithName(bodyDialog, nameDialog, body, name, 3, 5, 2);



    }

    private void startSecondQuest() {
        //play ambient music

        currentQuest = "forrek";

        String[] body = {

                "You take a look at the Second quest information.\nForrek the Orc\nHP: 200, DMG:20",
                "Forrek is a large Orc and a formidable soldier during the great Xi'lef War and guarded the ancient \ntemple of Pryton." +
                        "\nAfter many years he has grown weaker but still very powerful.",
                "Forrek is a very large and strong Orc with green skin enveloped by scars from his days at war." +
                        "\nHis weapon of choice is called Silverveil. It is very large sword but makes him slow during combat."

        };
        String[] name = {
                "", "", ""
        };
        startDialogLinesWithName(bodyDialog, nameDialog, body, name, 3, 5, 2);
    }


    /**
     * Goes back to main quest map
     */
    private void backToMenu(int wait) {
        musicFadeIn(ambient);
        //hide gameplay objects(monster, attack buttons,stats label )
        monsterImgView.setVisible(false);
        setAttackButtonVisibility(false);
        setStatLabelVisibility(false);
        //change game map
        fadeInImage(imgView, "file:assets/map.jpg", 13);

        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(wait));
        pauseTransition.setOnFinished(e -> setMapButtonVisibility(true));
        pauseTransition.play();



    }

    /**
     * Sets Stats Label Visibility
     *
     * @param b boolean state
     */
    private void setStatLabelVisibility(boolean b) {
        userStats.setVisible(b);
        monsterStats.setVisible(b);
    }

    /**
     * Sets attack button visibility
     *
     * @param b boolean state
     */
    private void setAttackButtonVisibility(boolean b) {

        longSwordBtn.setVisible(b);
        spearBtn.setVisible(b);
        warBowBtn.setVisible(b);
        potionBtn.setVisible(b);
        switchAxeBtn.setVisible(b);
    }

    /**
     * Fades out music for 5 sec
     *
     * @param battleMusic mediaplayer
     */
    private void musicFadeOut(MediaPlayer battleMusic) {
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(5),
                        new KeyValue(battleMusic.volumeProperty(), 0)));
        timeline.play();

        battleMusic.pause();

    }

    /**
     * Fades in music
     *
     * @param battleMusic Media player
     */
    private void musicFadeIn(MediaPlayer battleMusic) {
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(5),
                        new KeyValue(battleMusic.volumeProperty(), 100)));
        timeline.play();

        battleMusic.play();

    }


    /**
     * Sequential dialog wih name change
     *  @param bodyDialog   Label for body Text
     * @param nameDialog   Label for name Text
     * @param dialog       Array of dialog
     * @param name         array of names
     * @param cycle        how many cycles
     * @param wait         time to wait
     * @param sequenceTime fadetime
     */
    private void startDialogLinesWithName(Label bodyDialog, Label nameDialog, String[] dialog, String[] name, int cycle, int wait, int sequenceTime) {

        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(wait));
        pauseTransition.setOnFinished(e -> {


            final IntegerProperty i = new SimpleIntegerProperty(0);
            Timeline timeline = new Timeline(
                    new KeyFrame(
                            Duration.seconds(8),
                            event -> sequentialDialogWithName(bodyDialog, nameDialog, dialog[i.get()], name[i.get()], i, sequenceTime)
                    )
            );
            timeline.setCycleCount(cycle);
            timeline.play();

        });
        pauseTransition.play();


    }





    /**
     * Sets all button visibility
     *
     * @param state boolean value for visibility
     */
    private void setMapButtonVisibility(Boolean state) {
        gotoRW.setVisible(state);
        gotoOWT.setVisible(state);
        gotoHH.setVisible(state);
        gotoFR.setVisible(state);
    }

//    /**
//     * Changes the image and fades in with a delay of int wait
//     *
//     * @param imgView  canvas
//     * @param wait     time for pause
//     * @param timeFade time for fade
//     */
//    private void delayFadeIn(ImageView imgView, int wait, int timeFade, String path) {
//        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(wait));
//        pauseTransition.setOnFinished(e -> fadeInImage(imgView, path, timeFade));
//        pauseTransition.play();
//    }



    /**
     * Plays when the game is over
     */

    private void gameOver() {
        nameDialog.setText("");
        bodyDialog.setText("You have failed the quest!");


        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(2));
        pauseTransition.setOnFinished(e -> {
            try {
                TimeUnit.SECONDS.sleep(5);
                System.exit(0);
            } catch (InterruptedException f) {
                f.printStackTrace();
            }
        });
        pauseTransition.play();


    }





//    /**
//     * Plays music and returns mediaPlyer
//     *
//     * @param musicPath - string path of music
//     * @return Mediaplayer for string
//     */
//    public MediaPlayer playMusic(String musicPath,MediaPlayer mediaPlayer,GridPane canvas) {
//        File musicFile = new File(musicPath);// For example
//
//        Media sound = new Media(musicFile.toURI().toString());
//        mediaPlayer = new MediaPlayer(sound);
//        mediaPlayer.play();
//
//
//        MediaView mediaView = new MediaView(mediaPlayer);
//        canvas.getChildren().add(mediaView);
//
//        return mediaPlayer;
//
//    }


}
