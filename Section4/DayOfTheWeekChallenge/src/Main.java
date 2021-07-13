public class Main {
    public static void main(String[] args) {
        //Valid tests
        DayOfTheWeekChallenge.printDayOfTheWeek(0);
        DayOfTheWeekChallenge.printDayOfTheWeek(4);
        DayOfTheWeekChallenge.printDayOfTheWeekIfElse(1);
        DayOfTheWeekChallenge.printDayOfTheWeekIfElse(5);

        //Invalid tests
        DayOfTheWeekChallenge.printDayOfTheWeek(20);
        DayOfTheWeekChallenge.printDayOfTheWeekIfElse(30);
    }
}
