public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        long zero = 0;
        long minutesMax = 60;
        long hoursMax = 24;
        long daysMax = 365;
        long hours;
        long days;
        long years;
        long remainingDays;

        if (minutes < zero) {
            System.out.println("Invalid Value");
        }
        else {
            hours = minutes / minutesMax;
            days = hours / hoursMax;
            years = days / daysMax;
            remainingDays = days % daysMax;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}
