public class Main {

    public static void main(String[] args) {
        //Both feet and inches tests
        System.out.println(FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(12, 4));
        System.out.println(FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(0, 4));
        System.out.println(FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(-1, 1));

        //Only inches tests
        System.out.println(FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(9));
        System.out.println(FeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(15));
    }
}
