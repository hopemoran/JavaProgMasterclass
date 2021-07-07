public class TeenNumberChecker {

    public static boolean hasTeen(int age1, int age2, int age3) {
        int minTeenAge = 13;
        int maxTeenAge = 19;

        if (age1 >= minTeenAge && age1 <= maxTeenAge)
            return true;
        else if (age2 >= minTeenAge && age2 <= maxTeenAge)
            return true;
        else if (age3 >= minTeenAge && age3 <= maxTeenAge)
            return true;

        return false;
    }

    public static boolean isTeen(int age) {
        int minTeenAge = 13;
        int maxTeenAge = 19;

        if (age >= minTeenAge && age <= maxTeenAge)
            return true;

        return false;
    }
}
