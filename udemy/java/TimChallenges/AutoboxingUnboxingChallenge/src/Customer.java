import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private double depositTransaction;
    private double withdrawTransaction;
    private double currentBalance;
    private ArrayList<Double> withdrawTransactions;
    private ArrayList<Double>depositTransactions;
    private ArrayList<Double>currentBalances;

    public Customer(double depositTransaction, String firstName, String lastName) {
        this.withdrawTransactions = new ArrayList<>();
        this.depositTransactions = new ArrayList<>();
        this.currentBalances = new ArrayList<>();
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public double deposits(){
        for(Double deposit: depositTransactions){
            return deposit;
        }
        return -1;
    }

    public double withdraws(){
        for(Double withdraw: withdrawTransactions){
            return withdraw;
        }
        return -1;
    }

    public double currentBalances(){
        for (Double currentBalance: currentBalances){
            return currentBalance;
        }
        return -1;
    }

    public boolean depositTransaction(double deposit){
        if(deposit > 0.0){
            setDepositTransaction(deposit);
            this.depositTransactions.add(deposit);
            this.currentBalance += deposit;
            return true;
        }
        return false;
    }

    public boolean withdrawTransaction(double withdraw){
        if(withdraw > 0.0 && withdraw > this.currentBalance){
            setWithdrawTransaction(withdraw);
            this.withdrawTransactions.add(withdraw);
            this.currentBalance -= withdraw;
            return true;
        }
        return false;
    }

    private void setDepositTransaction(double depositTransaction) {
            this.depositTransaction = depositTransaction;
    }

    private void setWithdrawTransaction(double withdrawTransaction) {
            this.withdrawTransaction = withdrawTransaction;
    }

    public double getDepositTransaction() {
        return depositTransaction;
    }

    public double getWithdrawTransaction() {
        return withdrawTransaction;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName(){
        return this.lastName + ", " + this.firstName;
    }

    public static Customer createCustomer(double depositTransaction, String firstName, String lastName){
        if (depositTransaction > 0.0) {
            return new Customer(depositTransaction, firstName, lastName);

        }else {
            return null;
        }

    }
}

