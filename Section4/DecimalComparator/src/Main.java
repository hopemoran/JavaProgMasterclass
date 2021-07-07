public class Main {

    public static void main(String[] args) {
        boolean check0 = DecimalComparator.areEqualByThreeDecimalPlaces(3.1673, 3.1671);
        boolean check1 = DecimalComparator.areEqualByThreeDecimalPlaces(3.1673, 3.161);
        System.out.println(check0);
        System.out.println(check1);
    }
}
