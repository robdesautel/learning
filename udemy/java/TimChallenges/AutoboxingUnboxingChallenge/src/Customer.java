public class Customer {
    private String name;
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
        if( this.transaction.customerDeposit(customerDeposit)) {
            this.currentBalance += customerDeposit;
            return true;
        }
        return false;
    }

    public boolean addCustomerWithdraw(double customerWithdraw){
        if(this.transaction.customerWithdraw(customerWithdraw)){
            this.currentBalance -= customerWithdraw;
            return true;
        }
        return false;
    }


    public void getCustomerDeposits(){
        for(int i = 0; i < this.transaction.getDeposits().size(); i++)
            System.out.println("Deposits made " + this.transaction.getDeposits().get(i));
    }

    public void getCustomerWithdraws(){
        for(int i = 0; i < this.transaction.getWithdraws().size(); i++)
            System.out.println("Withdraws made " + this.transaction.getWithdraws().get(i));
    }

    public String getName() {
        return name;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

}

