import org.w3c.dom.ls.LSOutput;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3rd instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);

        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        System.out.println(Math.PI);

        int pw = 674312;
        Password password = new ExtendedPassword(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(4695);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }



    public static int multiply(int number) {
        return number * multiplier;
    }

}
