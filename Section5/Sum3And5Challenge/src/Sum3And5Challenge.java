public class Sum3And5Challenge {

    public static int forStatementSum() {
        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                counter++;
                if (counter == 5) {
                    break;
                }
            }
        }
        return sum;
    }
}
