import java.util.*;

public class MinAndMax {

    public static void minAndMax() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> values = new ArrayList<Integer>();
        int i = 0;
        int min;
        int max;

        while (true) {
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                values.add(number);
                scanner.nextLine();
            }
            else {
                List<Integer> sortedList = new ArrayList<>(values);
                Collections.sort(sortedList);
                max = sortedList.get(sortedList.size() -1);
                min = sortedList.get(0);
                System.out.println("max: " + max + " min: " + min);
                return;
            }
        }
    }
}
