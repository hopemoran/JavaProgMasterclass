import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       int[] myIntegerArray = getIntegers(5);
       printArray(myIntegerArray);

    }

    public static int[] getIntegers(int arraySize) {
        System.out.println("Enter " + arraySize + " integers values.\r");
        int[] values = new int[arraySize];

        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        int[] sortedArray = new int[unsortedArray.length];
        for (int i=0; i<unsortedArray.length; i++) {
            sortedArray[i] = unsortedArray[i];
        }
//        int[] sortedArray = Array.copyOf(unsortedArray, unsortedArray.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i=0; i<sortedArray.length; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
