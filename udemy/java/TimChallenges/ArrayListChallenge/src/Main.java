import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Contact contact = new Contact("5557845");

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    menu();
                    break;
                case 1:
                    contact.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateExistingContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }


    private static void menu(){
        System.out.println("\nPress ");
        System.out.println("0 - To view menu.\n" +
                           "1 - To print contacts.\n" +
                           "2 - To add a new contact.\n" +
                           "3 - To update an existing contact.\n" +
                           "4 - To remove contact.\n" +
                           "5 - To query contact.\n" +
                           "6 - To quit.");

    }

    private static void addNewContact() {
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();
        ContactName contactName = ContactName.createContact(firstName, lastName, phoneNumber);
        if(contact.addNewContact(contactName)){
            System.out.println(firstName + ", " + lastName + " => " + phoneNumber + " successfully added.");
        }else {
            System.out.println(firstName + "already exists." + " Not added.");
        }
    }

    private static void updateExistingContact() {
        System.out.println("Enter first name to update: \r");
        String firstName = scanner.nextLine();
        ContactName record = verifyRecord(firstName);
        if (record == null){
            return;
        }
        System.out.println("Enter last name: \r");
        String lastName = scanner.nextLine();
        System.out.println("Enter phone number: \r");
        String phoneNumber = scanner.nextLine();
        submitUpdatedContact(record, firstName, lastName, phoneNumber);
    }

    private static void submitUpdatedContact(ContactName existingContact,
                                             String firstName,
                                             String lastName,
                                             String phoneNumber) {
        ContactName newContact = ContactName.createContact(firstName, lastName, phoneNumber);
        if(contact.modifyContact(existingContact, newContact)){
            System.out.println("Record updated successfully!");
        }else {
            System.out.println("Record not updated!");
        }
    }

    private static ContactName verifyRecord(String firstName) {
        ContactName existingContactRecord = contact.queryContact(firstName);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return null;
        }
        return existingContactRecord;
    }

    private static void removeContact() {
        System.out.println("Enter name to remove: \r");
        String firstName = scanner.nextLine();
        ContactName record = verifyRecord(firstName);
        if (record == null){
            return;
        }
        if(contact.remove(record)){
            System.out.println("record successfully removed.");
        }else {
            System.out.println("record was not able to be removed.");
        }
    }
    private static void queryContact(){
        System.out.println("Enter name to remove: \r");
        String firstName = scanner.nextLine();
        ContactName record = verifyRecord(firstName);
        if (record == null){
            return;
        }
        System.out.println("Name: " + record.getFirstName() + ", " + record.getLastName() +
                            "Phone number: " + record.getPhoneNumber());
    }
}
