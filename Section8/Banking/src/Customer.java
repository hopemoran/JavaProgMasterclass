import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, double initAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initAmount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }
}
