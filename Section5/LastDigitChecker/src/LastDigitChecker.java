public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if (isValid(num1) == false || isValid(num2) == false || isValid(num3) == false) {
            System.out.println("Numbers not within range");
            return false;
        }

        int num1LastDigit = num1 % 10;
        int num2LastDigit = num2 % 10;
        int num3LastDigit = num3 % 10;

        if (num1LastDigit == num2LastDigit || num1LastDigit == num3LastDigit || num2LastDigit == num3LastDigit) {
            System.out.println("Atleast two numbers have the same rightmost digits");
            return true;
        }

        System.out.println("No digits have the same right most digits");
        return false;
    }

    public static boolean isValid(int num) {

        if (num >= 10 && num <= 1000) {
            System.out.println(num + " is valid");
            return true;
        }

        System.out.println(num + " is not valid");
        return false;
    }

}
