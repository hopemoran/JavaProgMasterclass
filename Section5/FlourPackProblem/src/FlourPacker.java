public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int bigKilo = 5;
        int smallKilo = 1;
        int bigCountKilo = bigKilo * bigKilo;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            System.out.println("Negative input");
            return false;
        }
        else if ((bigCount * bigKilo) + smallCount >= goal) {
            while (bigCountKilo > 0 && goal > 4) {
                bigCountKilo -= bigKilo;
                goal -= bigKilo;
            }
            while (smallCount > 0 && goal > 0) {
                smallCount -= smallKilo;
                goal -= smallKilo;
            }
            if (goal == 0) {
                System.out.println("Valid input");
                return true;
            }
            else {
                System.out.println("Invalid input");
                return false;
            }
        }

        System.out.println("Invalid input");
        return false;

    }

}
