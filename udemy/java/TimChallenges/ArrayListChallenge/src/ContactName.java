import java.util.ArrayList;

public class ContactName{

    private String firstName;
    private String lastName;
    private String phoneNumber;

    public ContactName(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static ContactName createContact(String firstName, String lastName, String phoneNumber){
        return new ContactName(firstName, lastName, phoneNumber);
    }

}
