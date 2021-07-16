public class NumberToWords {

    public static int getDigitCount(int number) {

        if (number < 0) {
            System.out.println("Invalid input");
            return -1;
        }

        else {
            int counter = 0;
            while (number >= 0) {
                if (number == 0 && counter == 0) {
                    System.out.println(++counter);
                    return counter;
                }
                else if (number == 0 && counter != 0) {
                    System.out.println(counter);
                    return counter;
                }
                System.out.println("number: " + number);
                number = number / 10;
                counter++;
            }
        }
        return -1;
    }

}
