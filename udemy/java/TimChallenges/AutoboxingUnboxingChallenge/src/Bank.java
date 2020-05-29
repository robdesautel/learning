import org.graalvm.compiler.asm.sparc.SPARCAssembler;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.createCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean customerDeposit(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerDeposit(customerName, transaction);
        }
        return false;
    }

    public boolean customerWithdraw(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerWithdraw(customerName, transaction);
        }
        return false;
    }



    private Branch findBranch(String branchName){
        for(Branch branch : branches){
            if (branch.getName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }

    public void customerTransaction(String branchName){
        Branch branch = findBranch(branchName);

        if (branch != null){
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(Customer customer: branchCustomers) {
                System.out.println("Customer: " + customer.getName());
                System.out.println("Transactions:");
                customer.getCustomerDeposits();
                customer.getCustomerWithdraws();
            }
        }

    }
}


//    public boolean customerTransaction(String branchName, boolean showTransaction){
//        Branch branch = findBranch(branchName);
//            if(branch != null){
//                System.out.println("Customer details for branch " + branch.getName());
//
//                ArrayList<Customer> branchCustomers = branch.getCustomers();
//                for(Customer customer: branchCustomers){
//                    System.out.println("Customer: " + customer.getName());
//                    if(showTransaction){
//                        System.out.println("Transactions");
//                        ArrayList<Double> customerTransactions = customer.getTransactions();
//                        for(int i = 0; i < customerTransactions.size(); i++){
//                            System.out.println("[ " + (i + 1) + " ] Amount: " + customerTransactions.get(i) );
//                        }
//                    }
//                }
//                return true;
//            } else {
//                return false;
//
//            }
//    }


