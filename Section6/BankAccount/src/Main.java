public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        BankAccount bobsAccount = new BankAccount(567, 250, "Bob Brown", "myemail@bob.com", 77777);
        System.out.println("Account Number: " + bobsAccount.getAccountNumber());
        bankAccount.setAccountNumber(1234);
        bankAccount.setBalance(100);
        bankAccount.setCustomerName("Jane Russell");
        bankAccount.setEmail("janerussell4@gmail.com");
        bankAccount.setPhoneNumber(1234567890);

        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Balance = " + bankAccount.getBalance());
        System.out.println("Customer Name: " + bankAccount.getCustomerName());
        System.out.println("Customer Email: " + bankAccount.getEmail());
        System.out.println("Customer Phone Number: " + bankAccount.getPhoneNumber());

        bankAccount.depositFunds(100);
        System.out.println("Balance = " + bankAccount.getBalance());

        bankAccount.withdrawFunds(50);
        System.out.println("Balance = " + bankAccount.getBalance());

        bankAccount.withdrawFunds(25);
        bankAccount.withdrawFunds(200);

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Bob", 25000.00);
        System.out.println(customer2.getEmailAddress());

        VipCustomer customer3 = new VipCustomer("Jane", 100.00, "jane@email.com");
        System.out.println(customer3.getCreditLimit());
    }

}
