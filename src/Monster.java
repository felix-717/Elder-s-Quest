
import javafx.scene.layout.GridPane;


public abstract class Monster extends gameFunctions {
        double hp;
        double dmg;
        double criticalMultiplier;
        String name;
        String difficulty;
        String musicPath;
        /**
         * Critical percentages
         */
        int[] critical;
        /**
         * REspective frequencies
         */
        int[] freq;



        //constructor
        public Monster(String difficulty){
            this.difficulty = difficulty;
        }

        /**moster attacks and returns a multiplier
         *
         * @param canvas Grid pane canvas
         * @return double multiplier
         */
        public double attack(GridPane canvas) {
                Probability probObj = new Probability();
                playMusic(musicPath,canvas);
                System.out.println("Entered main attack, dmg is "+ dmg);
                criticalMultiplier = probObj.getProbability(critical,freq);
                return dmg*(criticalMultiplier*0.01 + 1);
        }

//        /**
//         * Plays music and returns mediaPlyer
//         *
//         * @param musicPath - string path of music
//         * @return Mediaplayer for string
//         */
//        public MediaPlayer playMusic(String musicPath, GridPane canvas) {
//                File musicFile = new File(musicPath);// For example
//
//                Media sound = new Media(musicFile.toURI().toString());
//                MediaPlayer mediaPlayer = new MediaPlayer(sound);
//                mediaPlayer.play();
//
//
//                MediaView mediaView = new MediaView(mediaPlayer);
//                canvas.getChildren().add(mediaView);
//
//                return mediaPlayer;
//
//        }







}

class lyngruel extends Monster {

        //constructor
        public lyngruel(String difficulty) {
                super(difficulty);
                this.name = "Lyngruel";
                this.hp =150;
                this.dmg = 15;
                this.critical = new int[]{25,50,10};
                this.freq = new int[] {50,5,45};

                this.musicPath = "assets/punch1.mp3";
        }
}
class forrek extends Monster {

        //constructor
        public forrek(String difficulty) {
                super(difficulty);
                this.name = "Forrek";
                this.hp =200;
                this.dmg = 20;
                this.critical = new int[]{25,50,75};
                this.freq = new int[] {40,50,10};

                this.musicPath = "assets/punch2.mp3";
        }
}

class merl extends Monster {

        //constructor
        public merl(String difficulty) {
                super(difficulty);
                this.name = "Merl";
                this.hp =300;
                this.dmg = 30;
                this.critical = new int[]{25,50,75};
                this.freq = new int[] {10,40,50};

                this.musicPath = "assets/punch3.mp3";
        }
}
class yaphets extends Monster {

        //constructor
        public yaphets(String difficulty) {
                super(difficulty);
                this.name = "Yaphets";
                this.hp =500;
                this.dmg = 50;
                this.critical = new int[]{100,200};
                this.freq = new int[] {25,75};

                this.musicPath = "assets/punch4.mp3";
        }
}


