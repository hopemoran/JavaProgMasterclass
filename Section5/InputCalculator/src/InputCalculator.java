import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        int sum = 0;
        int avg = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
               int number = scanner.nextInt();
               sum += number;
               ++counter;
               scanner.nextLine();
            }
            else {
                if (counter != 0) {
                    avg = (int) Math.ceil( (float) sum / counter);
                    System.out.println("SUM = " + sum + " AVG = " + avg);
                    return;
                }
                else {
                    System.out.println("SUM = " + sum + " AVG = " + avg);
                    return;
                }
            }
        }

    }

}
