public class DigitSumChallenge {

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int numOriginal = number;
        int sum = 0;
        int n = number % 10;

        while (number > 0) {
            sum += n;
            number = number / 10;
            n = number % 10;

        }
        System.out.println("Sum of " + numOriginal + ": " + sum);
        return sum;
    }

}
