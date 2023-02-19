import javafx.animation.*;
import javafx.scene.control.Label;

import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;

import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

import javafx.scene.text.FontWeight;
import javafx.util.Duration;

public class outro extends gameFunctions {
    MediaPlayer mediaplayer;

    public void startOutro(Label nameDialog, Label bodyDialog, ImageView imgView, GridPane canvas, AnchorPane firstPane) {


        playMusic("assets/end.mp3", canvas);

        String[] body = {
                "You head back to report to the town Chief" ,
                        "We thank you for your heroism, brave Hunter!"+
                "\nThough i'd like to apologize, about the Elder dragons.",
                        "No one has seen the Elder dragon for some time."+
                "\nNo one has a clue where the Elder dragon resides.","Kushala's power has always affected the stability of the island.\nHis power is yet to be rivaled and his prescience is always feared.",
                "Kushala still roams the island of Felistein.\nHis disappearance has caused wild monsters to cause havoc across the island.\nYou must seek the elder dragon before its too late!!",
                "Next Quest Investigate the disappearance of the Elder Dragons!"


        };

        String[] name = {
                "","Town Chief","Town Chief","","",""

        };


        String[] credit = {
                "Credits: \nIntro music:\n" +
                        "https://www.youtube.com/watch?v=aEqDtbC3bL8&t=18s&ab_channel=HalcyonSyzygy\n" +
                        "\n" +
                        "destroyed town:\n" +
                        "https://www.artstation.com/artwork/zavw\n" +
                        "\n" +
                        "dragon icon:\n" +
                        "https://www.flaticon.com/free-icon/dragon_2602964\n" +
                        "\n" +
                        "destroyed house bg\n" +
                        "https://www.youtube.com/watch?v=usVYaeqcI4k&ab_channel=Aramil\n" +
                        "\n" +
                        "background 1 forest\n" +
                        "https://wallhere.com/en/wallpaper/712853\n" +
                        "\n" +
                        "monster 1:\n" +
                        "https://criticalrole.fandom.com/wiki/Cloud_Giant\n" +
                        "\n" +
                        "Probability code\n" +
                        "https://www.geeksforgeeks.org/random-number-generator-in-arbitrary-probability-distribution-fashion/\n" +
                        "\n" +
                        "bow arrow:\n" +
                        "https://www.youtube.com/watch?v=kiKOo6HQFRw&ab_channel=GFXSounds\n" +
                        "\n" +
                        "other weapon sfx:\n" +
                        "https://www.youtube.com/watch?v=c_RjEKLacwo&ab_channel=HDSoundEffects\n" +
                        "\n" +
                        "battlesfx:\n" +
                        "https://www.youtube.com/watch?v=Dicrp9rYfmU&list=PL6F112y8X_M5F7_DFgeIbSI5Tb9Cx7CA4&index=1&ab_channel=Dagre\n" +
                        "\n" +
                        "Orc Rpg:\n" +
                        "https://www.pinterest.ru/pin/562950022164006755/?nic_v2=1a5PchXnE\n" +
                        "\n" +
                        "bg2&3:\n" +
                        "https://www.artstation.com/artwork/0AGww","\n" +
                "bg4:\n" +
                "https://www.artstation.com/artwork/8lyJ6q\n" +
                "\n" +
                "end bg:\n" +
                "https://www.artstation.com/artwork/zZyA6\n" +
                "\n" +
                "end music:\n" +
                "https://www.youtube.com/watch?v=I2qDap4hnmk&ab_channel=ASharedHettwand sfx:\n" +
                "wand sfx:\n" +
                "\n" +
                "https://www.youtube.com/watch?v=r2FtdKR4DYc&ab_channel=VisualVortexStudios", "Made by: \n\nFELIX AND THE CAT STUDIOS"





        };
        delayFadeIn(imgView,0,"file:assets/destroyed.jpg");

        startDialogLinesWithName(bodyDialog,nameDialog,body,name,6,2);

        //display title pic
        delayFadeIn(imgView,62,"file:assets/end.png");

        //play credits

        //create bg for text

        Rectangle bg = new Rectangle(252, 31, 494, 541);
        firstPane.getChildren().add(bg);
        Color c = Color.web("rgba(0,0,0,0.5)");
        bg.setFill(c);

        bg.setVisible(false);


        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(83));
        pauseTransition.setOnFinished(e -> bg.setVisible(true));
        pauseTransition.play();


        delayFadeIn(imgView,79,"file:assets/skyrimbg.jpg");





        Label creditLabel = new Label();
        creditLabel.setLayoutX(302);
        creditLabel.setLayoutY(43);
        creditLabel.setPrefSize(393,459);

        creditLabel.setTextFill(Color.WHITE);




        creditLabel.setFont(Font.font("Centaur", FontWeight.BOLD, 15));

        firstPane.getChildren().add(creditLabel);

        startDialogLines(creditLabel,credit,0,3,75);






    }


    /**
     * Changes the image and fades in with a delay of int wait
     *  @param imgView  canvas
     * @param wait     time for pause
     */
    private void delayFadeIn(ImageView imgView, int wait, String path) {
        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(wait));
        pauseTransition.setOnFinished(e -> fadeInImage(imgView, path, 10));
        pauseTransition.play();
    }




//    private void fadeOut(Label label) {
//        FadeTransition fade = new FadeTransition();
//        fade.setDuration(Duration.seconds(2));
//        fade.setNode(label);
//        fade.setFromValue(1);
//        fade.setToValue(0);
//        fade.play();
//    }
//
//    private void fadeIn(Label label) {
//        FadeTransition fade = new FadeTransition();
//        fade.setDuration(Duration.seconds(2));
//        fade.setNode(label);
//        fade.setFromValue(0);
//        fade.setToValue(1);
//        fade.play();
//    }


//    /**
//     * Fades in music
//     *
//     * @param battleMusic Media player
//     */
//    private void musicFadeIn(MediaPlayer battleMusic) {
//        Timeline timeline = new Timeline(
//                new KeyFrame(Duration.seconds(5),
//                        new KeyValue(battleMusic.volumeProperty(), 100)));
//        timeline.play();
//
//        battleMusic.play();
//
//    }



}
