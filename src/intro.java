import javafx.animation.*;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


import javafx.util.Duration;



public class intro extends gameFunctions{
//    MediaPlayer mediaPlayer;



//    //constructor
//    intro() {
//    }


    /**
     * Adds image to imgViewer
     *
     * @param path      -String path of image
     * @param imageView - imageview to be displayed
     */
    public void addImage(String path, ImageView imageView) {
        Image img = new Image(path, 998, 603, false, false);

        imageView.setImage(img);


    }

    public void startIntro(Label nameDialog, Label bodyDialog, ImageView imgView, GridPane canvas, String userName)  {


        String[] introText = {"Throughout the world, there are several adventurers\nSome seek the sights of uncharted lands, or perhaps the casual stroll through a familiar place just to see it at a different angle.",
                "However the most widely known are the Hunters, From beginners to masters,\nthese adventurers are restless in their pursuit of whatever goals they set their sights on."
                , "From gathering materials to slaying mighty beasts, from battling the lowliest of Jaggi to \nthe seemingly unstoppable elder dragons.\nHunters are without a doubt, the best adventurers the world has ever seen."
        };


        bodyDialog.setText("Throughout the world, there are several adventurers." +
                "\nSome seek the sights of uncharted lands, or perhaps the casual stroll through a familiar place\njust to see it at a different angle.");


        startDialogLines(bodyDialog, introText, 1, 2, 17);

        //displayTitlePic

        delayFadeIn(imgView, 52, "file:assets/titlepic.png");


        //prologue

        String[] prologueText = {
                "It was a cloudy day above the Forest of the Elders.\n" +
                        "Many knew of the forest as a place of exotic monsters,\n" +
                        "all of which were different in their own way, even dangerous,",
                "And the strange bond they share with the town of which the forest takes its name after.\n" +
                        "You have arrived in The Town of the Elders.",
                "As you enter, you are greeted with the sight of injured hunters, broken houses, and dead bodies.\n" +
                        " You ask around about what happened but everyone was too busy tending to the damage" +
                        "\nLooking around further more, you notice a well decorated old man, The Town Chief."
        };


        delayFadeIn(imgView, 70, "file:assets/destroyed.jpg");


        delayMusic("assets/destroyedhouse.mp3", canvas, 70);

        startDialogLines(bodyDialog, prologueText, 0, 3, 65);


        String[] dialog = {
                "Who?? who are you?", "I am Hunter " + userName + "\nStats: Hunter " + userName + " HP:1500 DMG:50\nWeapons: Long Sword, Switch Axe, Shield, Warbow\nPotions:3 ",
                "We could truly use a Hunter of such stature! Please seek the monsters and help us in this present \ndarkness!",
                "Four monsters have been bothering this town for a while, our hunters are stretched too thin to \ndeal with them.",
                "Out of pity you agree to help them"
        };

        String[] name = {
                "Town Chief", userName, "Town Chief", "Town Chief", ""
        };

        startDialogLinesWithName(bodyDialog, nameDialog, dialog, name, 5, 95);



        //display map and begin quest dialog
        pauseImage(imgView);
        delayMusic("assets/page.mp3",canvas,140);

        String[] dialogEnd = {
                "You are given a map by the town chief a map of the island of Felistein and you head off",
                "You take a look at the quest information.\nLyngruel the Giant\nHP: 150, DMG:15",
                "It resembles a giant, with hooked teeth, blue hair and a solid physique  \n" +
                        "When damaged enough, their rage mode is triggered.\n" +
                        "Most of their upper jaw will tighten, and they will be more aggressive.",
                "Lyngruel resides primarily in a lush environment\n" +
                        "that features tropical forested areas, secluded grottoes,\n" +
                        "and expansive, marshy lowlands.\n"

        };

        String[] nameEnd = {
                "", "", "",""
        };

        startDialogLinesWithName(bodyDialog,nameDialog,dialogEnd,nameEnd, 4,132);





    }

    /**Fades in image
     * @param imageView canvas
     *
     */
    private void pauseImage(ImageView imageView) {
        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(140));
        pauseTransition.setOnFinished(e -> fadeInImage(imageView, "file:assets/map.jpg", 5));
        pauseTransition.play();

    }

//    /**Sequential dialog wih name change
//     * @param bodyDialog Label for body Text
//     * @param nameDialog Label for name Text
//     * @param dialog Array of dialog
//     * @param name  array of names
//     * @param cycle how many cycles
//     * @param wait time to wait
//     */
//    private void startDialogLinesWithName(Label bodyDialog, Label nameDialog, String[] dialog, String[] name, int cycle, int wait) {
//
//        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(wait));
//        pauseTransition.setOnFinished(e -> {
//
//
//            final IntegerProperty i = new SimpleIntegerProperty(0);
//            Timeline timeline = new Timeline(
//                    new KeyFrame(
//                            Duration.seconds(10),
//                            event -> sequentialDialogWithName(bodyDialog, nameDialog, dialog[i.get()], name[i.get()], i)
//                    )
//            );
//            timeline.setCycleCount(cycle);
//            timeline.play();
//
//        });
//        pauseTransition.play();
//
//
//    }

//    *
//     * Sequences dialog with name
//     *  @param bodyDialog   label of body
//     * @param nameDialog   label of name
//     * @param dialog       string array of dialog
//     * @param name         string array of name
//     * @param i            index
//
//    private void sequentialDialogWithName(Label bodyDialog, Label nameDialog, String dialog, String name, IntegerProperty i) {
//        fadeOut(bodyDialog);
//        fadeOut(nameDialog);
//
//        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(2));
//        pauseTransition.setOnFinished(e -> {
//
//            bodyDialog.setText(dialog);
//            nameDialog.setText(name);
//            i.set(i.get() + 1);
//            fadeIn(bodyDialog);
//            fadeIn(nameDialog);
//
//        });
//        pauseTransition.play();
//
//
//    }


//    /**
//     * Inial dialog lines
//     *  @param bodyDialog   body dialog
//     * @param introText    array of strings
//     * @param index        start from index
//     * @param cycle        How many cycles
//     * @param wait         what time to start
//     */
//    private void startDialogLines(Label bodyDialog, String[] introText, int index, int cycle, int wait) {
//
//        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(wait));
//        pauseTransition.setOnFinished(e -> {
//
//
//            final IntegerProperty i = new SimpleIntegerProperty(index);
//             Timeline timeline = new Timeline(
//                new KeyFrame(
//                        Duration.seconds(10),
//                        event -> sequentialDialog(bodyDialog, introText[i.get()], i)
//                )
//        );
//        timeline.setCycleCount(cycle);
//        timeline.play();
//
//    });
//        pauseTransition.play();
//
//
//}


    /**
     * Plays music after a delay
     *
     * @param path   String path
     * @param canvas canvas
     * @param wait   time for wait
     */
    private void delayMusic(String path, GridPane canvas, int wait) {
        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(wait));
        pauseTransition.setOnFinished(e -> playMusic(path, canvas));
        pauseTransition.play();
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


//    /**
//     * Sequences dialog
//     *  @param bodyDialog body of dialog
//     * @param s          String
//     * @param i          start index
//     */
//    private void sequentialDialog(Label bodyDialog, String s, IntegerProperty i) {
//        fadeOut(bodyDialog);
//
//        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(2));
//        pauseTransition.setOnFinished(e -> {
//
//            bodyDialog.setText(s);
//            i.set(i.get() + 1);
//            fadeIn(bodyDialog);
//
//        });
//        pauseTransition.play();
//
//    }

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
//     * Plays music and returns mediaPlyer
//     *
//     * @param musicPath - string path of music
//     * @return Mediaplayer for string
//     */
//    public MediaPlayer playMusic(String musicPath, GridPane canvas) {
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

    }


