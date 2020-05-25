public class ContactName {
    private ContactNumber contactNumber;
    private String firstName;
    private String lastName;

    public ContactName(ContactNumber contactNumber, String firstName, String lastName) {
        this.contactNumber = contactNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ContactNumber getContactNumber() {
        return contactNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
