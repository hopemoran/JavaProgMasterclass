public class AreaCalculator {

    private static double INVALID_RETURN_VALUE = -1.0;

    public static double area(double radius) {

        if (radius < 0.0) {
            return INVALID_RETURN_VALUE;
        }

        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {

        if (x < 0.0 || y < 0.0) {
            return INVALID_RETURN_VALUE;
        }
        return x * y;

    }
}
