import java.util.ArrayList;
//I over complicated this had to watch the video.
public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialDeposit) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialDeposit);
    }
    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

