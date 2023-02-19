import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

import java.io.File;

/**
 * GAme functions that will be used by classes
 */
public class gameFunctions {


    /**
     * Plays music and returns mediaPlyer
     *
     * @param musicPath - string path of music
     * @return Mediaplayer for string
     */
    public MediaPlayer playMusic(String musicPath, GridPane canvas) {
        File musicFile = new File(musicPath);// For example

        Media sound = new Media(musicFile.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();


        MediaView mediaView = new MediaView(mediaPlayer);
        canvas.getChildren().add(mediaView);

        return mediaPlayer;

    }

    /**
     * Sequences dialog with name
     *
     * @param bodyDialog   label of body
     * @param nameDialog   label of name
     * @param dialog       string array of dialog
     * @param name         string array of name
     * @param i            index
     * @param sequenceTime wait
     */
    public void sequentialDialogWithName(Label bodyDialog, Label nameDialog, String dialog, String name, IntegerProperty i, int sequenceTime) {
        fadeOut(bodyDialog, sequenceTime);
        fadeOut(nameDialog, sequenceTime);

        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(sequenceTime));
        pauseTransition.setOnFinished(e -> {

            bodyDialog.setText(dialog);
            nameDialog.setText(name);
            i.set(i.get() + 1);
            fadeIn(bodyDialog, sequenceTime);
            fadeIn(nameDialog, sequenceTime);

        });
        pauseTransition.play();


    }
    private void fadeOut(Label label, int time) {
        FadeTransition fade = new FadeTransition();
        fade.setDuration(Duration.seconds(time));
        fade.setNode(label);
        fade.setFromValue(1);
        fade.setToValue(0);
        fade.play();
    }

    private void fadeIn(Label label, int time) {
        FadeTransition fade = new FadeTransition();
        fade.setDuration(Duration.seconds(time));
        fade.setNode(label);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();
    }
    /**
     * Changes the image and fades in
     *
     * @param imgView - canvas
     * @param path    - String path
     * @param time    - time in seconds for fade in
     */
    public void fadeInImage(ImageView imgView, String path, int time) {
        addImage(path, imgView);
        imgView.setOpacity(0);
        FadeTransition fade = new FadeTransition();
        fade.setDuration(Duration.seconds(time));
        fade.setNode(imgView);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();
    }

    /**
     * sets image to imgViewer
     *
     * @param path      -String path of image
     * @param imageView - imageView to be displayed
     */
    public void addImage(String path, ImageView imageView) {
        Image img = new Image(path, 998, 603, false, false);

        imageView.setImage(img);


    }

    /**Sequential dialog wih name change
     * @param bodyDialog Label for body Text
     * @param nameDialog Label for name Text
     * @param dialog Array of dialog
     * @param name  array of names
     * @param cycle how many cycles
     * @param wait time to wait
     */
    void startDialogLinesWithName(Label bodyDialog, Label nameDialog, String[] dialog, String[] name, int cycle, int wait) {

        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(wait));
        pauseTransition.setOnFinished(e -> {


            final IntegerProperty i = new SimpleIntegerProperty(0);
            Timeline timeline = new Timeline(
                    new KeyFrame(
                            Duration.seconds(8),
                            event -> sequentialDialogWithName(bodyDialog, nameDialog, dialog[i.get()], name[i.get()], i)
                    )
            );
            timeline.setCycleCount(cycle);
            timeline.play();

        });
        pauseTransition.play();


    }

    /**
     * Sequences dialog with name
     *  @param bodyDialog   label of body
     * @param nameDialog   label of name
     * @param dialog       string array of dialog
     * @param name         string array of name
     * @param i            index
     */
    private void sequentialDialogWithName(Label bodyDialog, Label nameDialog, String dialog, String name, IntegerProperty i) {
        fadeOut(bodyDialog);
        fadeOut(nameDialog);

        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(2));
        pauseTransition.setOnFinished(e -> {

            bodyDialog.setText(dialog);
            nameDialog.setText(name);
            i.set(i.get() + 1);
            fadeIn(bodyDialog);
            fadeIn(nameDialog);

        });
        pauseTransition.play();


    }
    private void fadeOut(Label label) {
        FadeTransition fade = new FadeTransition();
        fade.setDuration(Duration.seconds(2));
        fade.setNode(label);
        fade.setFromValue(1);
        fade.setToValue(0);
        fade.play();
    }

    private void fadeIn(Label label) {
        FadeTransition fade = new FadeTransition();
        fade.setDuration(Duration.seconds(2));
        fade.setNode(label);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();
    }

    /**
     * Inial dialog lines
     *  @param bodyDialog   body dialog
     * @param introText    array of strings
     * @param index        start from index
     * @param cycle        How many cycles
     * @param wait         what time to start
     */
    void startDialogLines(Label bodyDialog, String[] introText, int index, int cycle, int wait) {

        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(wait));
        pauseTransition.setOnFinished(e -> {


            final IntegerProperty i = new SimpleIntegerProperty(index);
            Timeline timeline = new Timeline(
                    new KeyFrame(
                            Duration.seconds(10),
                            event -> sequentialDialog(bodyDialog, introText[i.get()], i)
                    )
            );
            timeline.setCycleCount(cycle);
            timeline.play();

        });
        pauseTransition.play();


    }

    /**
     * Sequences dialog
     *  @param bodyDialog body of dialog
     * @param s          String
     * @param i          start index
     */
    private void sequentialDialog(Label bodyDialog, String s, IntegerProperty i) {
        fadeOut(bodyDialog);

        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(2));
        pauseTransition.setOnFinished(e -> {

            bodyDialog.setText(s);
            i.set(i.get() + 1);
            fadeIn(bodyDialog);

        });
        pauseTransition.play();





    }}

