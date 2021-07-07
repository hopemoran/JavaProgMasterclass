public class BarkingDog {

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (isBarking) {
            if (hourOfDay < 8 || hourOfDay > 22) {
                if (hourOfDay >= 0 && hourOfDay <= 23)
                    return true;
            }
        }
        return false;
    }
}
