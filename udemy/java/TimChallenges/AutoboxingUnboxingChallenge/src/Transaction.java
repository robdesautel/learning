public class Transaction {
    private double debit;
    private double credit;
    private double currentBalance;

    public Transaction(double credit) {
        this.credit = credit;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }


    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        if(debit > this.currentBalance || debit <= 0.00){
            this.debit = -1;
        }else {
            this.debit = debit;
            this.currentBalance -= debit;
        }
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        if (credit > 0.0) {
            this.credit = credit;
            this.currentBalance += credit;
        }
    }


    public static Transaction createTransaction(double credit){
        return new Transaction(credit);
    }
}
