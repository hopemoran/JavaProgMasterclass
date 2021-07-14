public class Main {
    public static void main(String[] args) {
        //isOdd() tests
        SumOdd.isOdd(0);
        SumOdd.isOdd(2);
        SumOdd.isOdd(3);

        //sumOdd() tests
        SumOdd.sumOdd(1, 100);
        SumOdd.sumOdd(-1, 100);
        SumOdd.sumOdd(100, 100);
        SumOdd.sumOdd(13, 13);
        SumOdd.sumOdd(100, -100);
        SumOdd.sumOdd(100, 1000);
    }
}
