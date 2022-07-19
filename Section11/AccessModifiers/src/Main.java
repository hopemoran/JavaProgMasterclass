public class Main {

    public static void main(String[] args) {
        Account hopesAccount = new Account("Hope");
        hopesAccount.deposit(1000);
        hopesAccount.withdraw(500);
        hopesAccount.withdraw(-200);
        hopesAccount.deposit(-20);
        hopesAccount.calculateBalance();

        System.out.println("Balance on account is " + hopesAccount.getBalance());
        hopesAccount.calculateBalance();
    }
}
