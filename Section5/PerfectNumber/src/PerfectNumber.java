public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            System.out.println("Invalid input");
            return false;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println("sum: " + sum);
            return true;
        }

        System.out.println(number + " is not a perfect number");
        return false;

    }

}
