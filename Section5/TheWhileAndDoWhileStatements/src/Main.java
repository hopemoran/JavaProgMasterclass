public class Main {

    public static void main(String[] args) {
        int count = 0;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i = 6; i != 6; i++) {
            System.out.println("Count value is " + count);
        }

        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 100) {
                break;
            }
        }

        while(count != 6);

        int number = 4;
        int finishNumber = 20;
        int evenNumbers = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);

            evenNumbers++;
            if (evenNumbers >= 5) {
                System.out.println("Total even numbers found " + evenNumbers);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0)
            return true;
        return false;
    }

}
