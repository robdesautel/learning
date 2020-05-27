import org.graalvm.compiler.asm.sparc.SPARCAssembler;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {

        this.name = name;
        this.customers = new ArrayList<>();
    }

    private int findCustomer(Customer customer){
        return this.customers.indexOf(customer);
    }

    private int findCustomer(String customerName){
        for(int i = 0; i < customers.size(); i++){
            Customer customer = this. customers.get(i);
            if(customer.getFullName().equals(customerName)){
                return i;
            }
        }
        return -1;
    }

    private boolean verifyCustomer(String customerName){
        return (findCustomer(customerName) >= 0);
    }

    public void customerDeposits(String customerFirstName, String customerLastName){
        String customerName = customerFirstName + ", " + customerLastName;
        if(verifyCustomer(customerName)){
            for (Customer customer : customers) {
                System.out.println("Deposits made: " +
                        customer.deposits());
            }
        }
    }

    public void customerBalances(String customerFirstName, String customerLastName){
        String customerName = customerFirstName + ", " + customerLastName;
        if(verifyCustomer(customerName)){
            for (Customer customer : customers) {
                System.out.println("Balances were: " +
                        customer.currentBalances());
            }
        }
    }

    public void customerWithdraws(String customerFirstName, String customerLastName){
        String customerName = customerFirstName + ", " + customerLastName;
        if(verifyCustomer(customerName)){
            for (Customer customer : customers) {
                System.out.println("Withdraws made: " +
                        customer.withdraws());
            }
        }
    }

    public void customerBalance(String customerFirstName, String customerLastName) {
        String customerName = customerFirstName + ", " + customerLastName;
        if (verifyCustomer(customerName)) {
            for (Customer customer : this.customers) {
                System.out.println(customerName + "'s balance is " +
                        customer.getCurrentBalance());
            }
        }
    }

    public boolean customerDeposit(String customerFirstName,
                                   String customerLastName,
                                   double customerDeposit) {
        String customerName = customerFirstName + ", " + customerLastName;
        if (verifyCustomer(customerName)) {
            for(Customer customer: this.customers){
                customer.depositTransaction(customerDeposit);
                return true;
            }
        }
        return false;
    }

    public boolean customerWithdraw(String customerFirstName,
                                   String customerLastName,
                                   double customerWithdraw) {
        String customerName = customerFirstName + ", " + customerLastName;
        if (verifyCustomer(customerName)) {
            for(Customer customer: this.customers){
                customer.withdrawTransaction(customerWithdraw);
                return true;
            }
        }
        return false;
    }

    public boolean addNewCustomer(Customer customer){
        if(findCustomer(customer.getFullName()) >= 0){
            System.out.println("Customer already exists!");
            return false;
        }
        customers.add(customer);
        return true;
    }

    public String getName() {
        return name;
    }


    public static Branch createBranch(String name){
        return new Branch(name);
    }
}
