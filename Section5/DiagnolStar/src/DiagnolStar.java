public class DiagnolStar {

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        }

        int rowCount = number;
        int i = 0;

        for (int currentRow = 0; currentRow <= number; currentRow++) {
            for (int currentColumn = 0; currentColumn <= number; currentColumn++) {
                if (currentRow == 0) {
                    System.out.print("*");
                }
                else if (currentColumn == 0) {
                    System.out.print("*");
                }
                else if (currentRow == number) {
                    System.out.print("*");
                }
                else if (currentColumn == number) {
                    System.out.print("*");
                }
                else if (currentRow == currentColumn) {
                    System.out.print("*");
                }
                else if (currentColumn == (rowCount - currentRow + i)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            i++;
            rowCount--;
            System.out.println();
        }

    }

}
