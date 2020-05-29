import java.util.ArrayList;
//I over complicated this had to watch the video.
public class Customer {
    private String name;
//    private ArrayList<Double> transactions;
    private double currentBalance;
    private Transaction transaction;


    public Customer(String name, double initialDeposit) {
        this.name = name;
        addTransaction(initialDeposit);
    }

    private void addTransaction(double amount){
        if(amount > 0.0) {
            this.transaction = new Transaction(amount);
            this.currentBalance += amount;
        }
    }

    public boolean addCustomerDeposit(double customerDeposit){
        return this.transaction.customerDeposit(customerDeposit);
    }

    public boolean addCustomerWithdraw(double customerWithdraw){
        return this.transaction.customerWithdraw(customerWithdraw);
    }

    public String getName() {
        return name;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void getCustomerDeposits(){
        for(int i = 0; i < this.transaction.getDeposits().size(); i++)
            System.out.println("Deposits made " + this.transaction.getDeposits().get(i));
    }

    public void getCustomerWithdraws(){
        for(int i = 0; i < this.transaction.getWithdraws().size(); i++)
            System.out.println("Deposits made " + this.transaction.getWithdraws().get(i));
    }


//    public ArrayList<Double> getTransactions() {
//        return transactions;
//    }
}

