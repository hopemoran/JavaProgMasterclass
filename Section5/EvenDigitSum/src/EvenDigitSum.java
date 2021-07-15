public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int lastDigit = number % 10;

        if (number < 0) {
            System.out.println("Invalid input");
            return -1;
        }

        while (number != 0) {
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            number = number / 10;
            lastDigit = number % 10;
        }

        System.out.println("Sum: " + sum);
        return sum;
    }

}
