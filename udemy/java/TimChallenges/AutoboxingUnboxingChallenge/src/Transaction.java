import java.util.ArrayList;

public class Transaction {
    private ArrayList<Double> deposits;
    private ArrayList<Double> withdraws;

    public Transaction(double initialDeposit) {
        addInitialDeposit(initialDeposit);
        this.deposits = new ArrayList<>();
        this.withdraws = new ArrayList<>();
    }

    private void addInitialDeposit(double initialDeposit) {
        if(initialDeposit > 0.0){
            this.deposits.add(initialDeposit);
            System.out.println("Initial deposit of: " + initialDeposit + " has been deposited!");
            return;
        }
        System.out.println("Initial deposit of: " + initialDeposit + " was unsuccessful!");
    }

    public boolean customerDeposit(double customerDeposit){
        if(customerDeposit > 0.0){
            this.deposits.add(customerDeposit);
            return true;
        }
        return false;
    }

    public boolean customerWithdraw(double customerWithdraw)  {
        if(customerWithdraw > 0.0){
            this.withdraws.add(customerWithdraw);
            return true;
        }
        return false;
    }

    public ArrayList<Double> getDeposits() {
        return deposits;
    }

    public ArrayList<Double> getWithdraws() {
        return withdraws;
    }

}
