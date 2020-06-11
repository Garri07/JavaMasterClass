public class Main {

    public static void main(String[]args){

        String player = "Alexandra";
        int score = 50;

        displayHighScorePosition(player, calculateHighScorePosition(score));

    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        int position;

        if(score > 1000){
            return 1;
        } else if (score <= 1000 && score > 500) {
            return 2;
        } else if (score <= 500 && score > 100) {
            return 3;
        } else {
            return 4;
        }
    }

}
