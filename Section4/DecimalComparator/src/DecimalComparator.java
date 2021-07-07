import java.text.DecimalFormat;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        DecimalFormat df = new DecimalFormat("#.000");
        double roundedNum1 = Double.valueOf(df.format(num1));
        double roundedNum2 = Double.valueOf(df.format(num2));

        return roundedNum1 == roundedNum2;
    }
}
