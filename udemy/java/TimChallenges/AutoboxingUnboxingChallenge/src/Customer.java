import java.util.ArrayList;

public class Customer extends Transaction{
    private String firstName;
    private String lastName;
    private ArrayList<Transaction> transactions;

    public Customer(double credit, String firstName, String lastName) {
        super(credit);
        this.firstName = firstName;
        this.lastName = lastName;
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

    public static Customer createCustomer(String firstName, String lastName, double credit){
        return new Customer(credit, firstName, lastName);
    }
}

