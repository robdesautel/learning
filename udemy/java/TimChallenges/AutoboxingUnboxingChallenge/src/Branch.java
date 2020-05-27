import org.graalvm.compiler.asm.sparc.SPARCAssembler;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Branch {
    private String Name;
    private double loan;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        Name = name;
    }

    public double getLoan() {
        return loan;
    }

    public String getName() {
        return Name;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public static Branch createBranch(String name){
        return new Branch(name);
    }
}
