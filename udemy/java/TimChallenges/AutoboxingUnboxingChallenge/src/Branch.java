import org.graalvm.compiler.asm.sparc.SPARCAssembler;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Branch{
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean createCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerDeposit(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            return existingCustomer.addCustomerDeposit(amount);
        }
        return false;
    }

    public boolean addCustomerWithdraw(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            return existingCustomer.addCustomerWithdraw(amount);
        }
        return false;
    }


    private Customer findCustomer(String customerName){
        for(Customer customer: this.customers){
            if(customer.getName().equals(customerName)){
                return customer;
            }
        }
        return null;
    }

}
