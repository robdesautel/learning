import java.lang.invoke.LambdaConversionException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class Contact{
    private String myNumber;
    private ArrayList<ContactName> contactList;

    public Contact(String myNumber) {
        this.myNumber = myNumber;
        this.contactList = new ArrayList<>();
    }

    public boolean addNewContact(ContactName contactName){
        if(findContact(contactName.getFirstName()) >= 0){
            System.out.println("Contact already exists!");
            return false;
        }
        contactList.add(contactName);
        return true;
    }

    private int findContact(ContactName contactName){
        return this.contactList.indexOf(contactName);
    }

    private int findContact(String firstName) {
        /* TODO: add more searching parameters
        */
        for(int i = 0; i < contactList.size(); i++){
            ContactName contactName = this.contactList.get(i);
            if(contactName.getFirstName().equals(firstName)){
                return i;
            }
        }
        return -1;
    }

    public boolean remove(ContactName contactRecord){
        int index = findContact(contactRecord.getFirstName());
        if(index < 0){
            System.out.println(contactRecord.getFirstName() + ", is not in the list.");
            return false;
        }
        this.contactList.remove(index);
//        System.out.println(contactRecord.getFirstName() + " was removed or the list");
        return true;
    }

    public boolean modifyContact(ContactName oldContact, ContactName newContact){
        /* TODO:
            add more validation for fields.
            add more functionality for field updates.
         */
        int index = findContact(oldContact.getFirstName());
        if(index < 0){
            System.out.println(oldContact.getFirstName() + ", is not in the list.");
            return false;
        }
        contactList.set(index, newContact);
        System.out.println(oldContact.getFirstName() + " was replaced by " + newContact.getFirstName());
        return true;
    }

    public String queryContact(ContactName contactName){
        if (findContact(contactName) >= 0){
            return contactName.getFirstName();
        }
        return null;
    }

    public ContactName queryContact(String firstName){
        /* TODO:
            query for additional fields.
         */

        int index = findContact(firstName);
        if(index >= 0 ){
            return this.contactList.get(index);
        }
        return null;
    }

    public void printContacts(){
        int i = 1;
        for(ContactName contactName: contactList ){
            System.out.println(i + contactName.getFirstName() + ", " +
                                contactName.getLastName() + " => " +
                                contactName.getPhoneNumber());
            i++;
        }
    }

}
