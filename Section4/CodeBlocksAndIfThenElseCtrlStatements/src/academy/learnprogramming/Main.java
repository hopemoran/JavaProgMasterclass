package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

//        Challenge:
        boolean secondGameOver = true;
        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;

        if (secondGameOver) {
            int finalScore = secondScore + (secondLevelCompleted * secondBonus);
            System.out.println("Your second final score was " + finalScore);
        }
    }
}
