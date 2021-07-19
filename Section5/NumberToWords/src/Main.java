public class Main {

    public static void main(String[] args) {

        //getDigitCount() tests
        NumberToWords.getDigitCount(0);
        NumberToWords.getDigitCount(123);
        NumberToWords.getDigitCount(-12);
        NumberToWords.getDigitCount(5200);

        //reverse() tests
        NumberToWords.reverse(-121);
        NumberToWords.reverse(1212);
        NumberToWords.reverse(1234);
        NumberToWords.reverse(100);


        //numberToWords() tests
        NumberToWords.numberToWords(123);
        System.out.println("Next process\n");
        NumberToWords.numberToWords(1010);
        System.out.println("Next process\n");
        NumberToWords.numberToWords(1000);
        System.out.println("Next process\n");
        NumberToWords.numberToWords(-12);

    }

}
