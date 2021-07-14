public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                return true;
            }
            else if (year % 100 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }
        if (isLeapYear(year) == true) {
            return 29;
        }
        else if (isLeapYear(year) == false) {
            switch(month){
                case 9:
                    return 30;
            }

        }
    }
}
