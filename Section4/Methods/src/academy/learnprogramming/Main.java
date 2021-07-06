package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        gameOver = false;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        String name1 = "Paul";
        int score1 = 1500;
        int highScore1 = calculateHighScorePosition(score1);
        displayHghScorePosition(name1, highScore1);

        String name2 = "Michael";
        int score2 = 900;
        int highScore2 = calculateHighScorePosition(score2);
        displayHghScorePosition(name2, highScore2);

        String name3 = "Chris";
        int score3 = 400;
        int highScore3 = calculateHighScorePosition(score3);
        displayHghScorePosition(name3, highScore3);

        String name4 = "Jean";
        int score4 = 50;
        int highScore4 = calculateHighScorePosition(score4);
        displayHghScorePosition(name4, highScore4);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    public static void displayHghScorePosition(String name, int pos) {
        System.out.println(name + " managed to get into position " + pos + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        }
        else if (score >= 500) {
            position = 2;
        }
        else if (score >= 100); {
            position = 3;
        }
        return position;
    }
}
