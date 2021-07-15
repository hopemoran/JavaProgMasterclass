public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int lastDigit;
        int reverse = 0;
        int originalNumber = number;

        while (number != 0) {
            lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number = number / 10;
        }

        if (reverse == originalNumber) {
            System.out.println("Returning true");
            return true;
        }
        System.out.println("Returning false");
        return false;
    }

}
