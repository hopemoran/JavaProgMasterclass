public class FeetAndInchesToCentimeters {

    public static int calcFeetAndInchesToCentimeters(int feet, int inches) {

        double inchesSum = 0.0d;
        if (feet >= 0) {
            inchesSum = feet * 12;
            if (inches >= 0 && inches <= 12) {
                inchesSum += inches;
                int centimeters = (int) Math.round(inchesSum * 2.54d);
                return centimeters;
            }
        }
        return -1;
    }

    public static int calcFeetAndInchesToCentimeters(int inches) {

        int feet;
        int noFeet = 0;

        if (inches >= 0) {
            if (inches >= 12) {
                feet = inches / 12;
                inches = inches % 12;
                return calcFeetAndInchesToCentimeters(feet, inches);
            }
            else
                return calcFeetAndInchesToCentimeters(noFeet, inches);
        }
        return -1;
    }
}
