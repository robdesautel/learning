
import java.util.ArrayList;

public class Main {
    private static Bank bank = new Bank("HQ");
    private static ArrayList<Bank> banks = new ArrayList<>();
    public static void main(String[] args) {
        bank.addBranch("RobertBranch");
        bank.addCustomer("RobertBranch", "Johnny", 5.25);
        bank.customerDeposit("RobertBranch", "Johnny", 100.63);
        bank.customerDeposit("RobertBranch", "Johnny", 83.24);
        bank.customerDeposit("RobertBranch", "Johnny", 22.98);
        bank.customerDeposit("RobertBranch", "Johnny", 17.36);
        bank.customerAccountBalance("RobertBranch", "Johnny");

        bank.customerWithdraw("RobertBranch", "Johnny", 22.96);
        bank.customerWithdraw("RobertBranch", "Johnny", 60.32);


        bank.customerAccountBalance("RobertBranch", "Johnny");
        bank.customerTransaction("RobertBranch");
    }
}
