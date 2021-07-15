public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {

        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            System.out.println("Not within range of 10-99");
            return false;
        }

        int originalNum2 = num2;

        while (num1 != 0) {
            int lastDigitNum1 = num1 % 10;
            while (num2 != 0) {
                int lastDigitNum2 = num2 % 10;
                if (lastDigitNum1 == lastDigitNum2) {
                    System.out.println(lastDigitNum1);
                    return true;
                }
                num2 = num2 / 10;
            }
            num2 = originalNum2;
            num1 = num1 / 10;
        }

        System.out.println("No shared digit");
        return false;
    }

}
