import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int arrayLength = readInteger();
        int[] array = readElements(arrayLength);
        int min = findMin(array);
    }

    public static int readInteger() {
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        return number;
    }

    public static int[] readElements(int number) {
        System.out.println("Enter " + number + " elements: ");
        int[] values = new int[number];

        for (int i=0; i<number; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    private static int findMin(int[] values) {
        int j = 0;
        int min = values[0];
        for (int i=1; i<values.length; i++) {
            if (values[i] < values[j]) {
                min = values[i];
                j++;
            }
        }
        System.out.println("The minimum number is: " + min);
        return min;
    }
}
