package academy.learnprogramming;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//	    int value = 1;
//	    if (value == 1) {
//            System.out.println("Value was 1");
//        }
//	    else if (value == 2) {
//            System.out.println("Value was 2");
//        }
//	    else {
//            System.out.println("Was not 1 or 2");
//        }

	    int switchValue = 6;

	    switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was a 3, or a 4, or a 5");
                break;

            default:
                System.out.println("Value was not 1, 2, 3, 4, or 5");
                break;
        }

        char switchChar = 'A';

	    switch (switchChar) {
            case 'A':
                System.out.println("Char was A");
                break;

            case 'B':
                System.out.println("Char was B");
                break;

            case 'C':
                System.out.println("Char was C");
                break;

            case 'D':
                System.out.println("Char was D");
                break;

            case 'E':
                System.out.println("Char was E");
                break;

            default:
                System.out.println("Char was not found");
                break;
        }

        String month = "JUNE";

	    switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
                break;
        }
        // More code here
    }
}
