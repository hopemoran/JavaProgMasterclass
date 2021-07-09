public class Main {

    public static void main(String[] args) {
        //Valid tests
        System.out.println(SecondsAndMinutes.getDurationString(65, 8));
        System.out.println(SecondsAndMinutes.getDurationString(3945));

        //Invalid tests
        System.out.println(SecondsAndMinutes.getDurationString(0, -9));
        System.out.println(SecondsAndMinutes.getDurationString(-30));
    }
}
