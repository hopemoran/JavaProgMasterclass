public class Main {

    public static void main(String[] args) {
        //Valid tests
        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(5.0, 4.0));

        //Invalid tests
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(-1.0, 4.0));
    }

}
