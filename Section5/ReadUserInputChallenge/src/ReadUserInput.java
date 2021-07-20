import java.util.Scanner;

public class ReadUserInput {

    public static void readUserInput() {

        int x = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (x < 11) {
            System.out.println("Enter number #" + x + ":");
            boolean hastNextInt = scanner.hasNextInt();
            if (hastNextInt) {
                int number = scanner.nextInt();
                sum += number;
            }
            else {
                System.out.println("Invalid input");
            }

            x++;
        }

        System.out.println("Sum: " + sum);

    }

}
