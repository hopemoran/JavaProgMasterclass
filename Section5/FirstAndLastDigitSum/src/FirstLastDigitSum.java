public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        else if (number < 10) {
            return number + number;
        }
        else {
            int lastDigit = number % 10;
            int reverse = 0;
            int orginalLast = lastDigit;
            while (number > 0) {
                lastDigit = number % 10;
                reverse = reverse * 10;
                reverse += lastDigit;
                number = number / 10;
            }
            int firstDigit = reverse % 10;
            int result = firstDigit + orginalLast;

            return result;
        }
    }

}
