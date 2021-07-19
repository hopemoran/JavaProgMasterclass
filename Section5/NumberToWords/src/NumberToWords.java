public class NumberToWords {

    public static int getDigitCount(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return -1;
        }

        else {
            int counter = 0;
            while (number >= 0) {
                if (number == 0 && counter == 0) {
                    ++counter;
                    return counter;
                }
                else if (number == 0 && counter != 0) {
                    return counter;
                }
                number = number / 10;
                counter++;
            }
        }
        return -1;
    }

    public static int reverse(int number) {

        int lastDigit;
        int reverse = 0;

        while (number != 0) {
            lastDigit = number % 10;
            number = number / 10;
            reverse = reverse * 10;
            reverse += lastDigit;
        }

        return reverse;
    }

    public static void numberToWords(int number) {

        int digitCount = getDigitCount(number);
        int numberReversed = reverse(number);
        int lastDigit;
        String numberToWordsString = "";

        while (digitCount > 0) {
            lastDigit = numberReversed % 10;
            numberReversed = numberReversed / 10;

            switch (lastDigit) {
                case 0:
                    numberToWordsString += "Zero\n";
                    break;
                case 1:
                    numberToWordsString += "One\n";
                    break;
                case 2:
                    numberToWordsString += "Two\n";
                    break;
                case 3:
                    numberToWordsString += "Three\n";
                    break;
                case 4:
                    numberToWordsString += "Four\n";
                    break;
                case 5:
                    numberToWordsString += "Five\n";
                    break;
                case 6:
                    numberToWordsString += "Six\n";
                    break;
                case 7:
                    numberToWordsString += "Seven\n";
                    break;
                case 8:
                    numberToWordsString += "Eight\n";
                    break;
                case 9:
                    numberToWordsString += "Nine\n";
                    break;
            }

            digitCount--;

        }
        System.out.println(numberToWordsString);
    }
}
