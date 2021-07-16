public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            System.out.println("Invalid input");
            return -1;
        }

        if (first < second) {
            int i = first;
            while (i >= 0) {
                if (first % i == 0 && second % i == 0) {
                    System.out.println(i + " is the gcd");
                    return i;
                }
                i--;
            }
        }

        else if (second < first) {
            int j = second;
            while (j >= 0) {
                if (first % j == 0 && second % j == 0) {
                    System.out.println(j + " is the gcd");
                    return j;
                }
                j--;
            }
        }

        System.out.println("Invalid input");
        return -1;
    }

}
