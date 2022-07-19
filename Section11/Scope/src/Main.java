import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String varFour = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();
        System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());
        System.out.printf(varFour);

        scopeInstance.timesTwo();
        System.out.printf("*****************************************\n");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();

        X x = new X(new Scanner(System.in));
        x.x();
    }
}
