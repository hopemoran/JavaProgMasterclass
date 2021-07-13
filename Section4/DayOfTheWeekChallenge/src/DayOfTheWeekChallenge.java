public class DayOfTheWeekChallenge {

    public static void printDayOfTheWeek(int day) {
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void printDayOfTheWeekIfElse(int day) {
        if (day == 0){
            System.out.println("Sunday");
        }
        else if (day == 1) {
            System.out.println("Monday");
        }
        else if (day == 2 || day == 3 || day == 4 || day == 5 || day == 6) {
            System.out.println("Tuesday or Wednesday or Thursday or Friday or Saturday");
        }
        else {
            System.out.println("Invalid day");
        }
    }
}
