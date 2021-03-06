public class SumOdd {

    public static boolean isOdd(int number) {
        if (number < 0 || number % 2 == 0)
            return false;
        else
            return true;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end < start || start < 0 || end < 0) {
            System.out.println("Invalid input");
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (isOdd(i) == true) {
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
        return sum;
    }

}
