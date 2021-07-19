public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number <= 1) {
            System.out.println("Invalid input");
            return -1;
        }

        else {
            int div = 2;
            while (div < number) {
                if (number % div != 0) {
                    div++;
                }
                else {
                    number = number / div;
                    div = 2;
                }
            }
            System.out.println(number);
            return number;
        }

    }

}
