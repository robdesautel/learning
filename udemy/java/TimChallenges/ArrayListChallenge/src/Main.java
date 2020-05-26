import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Contact contact = new Contact();

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
                    contact.printItems();
                    break;
                case 2:
                    enterCellPhone();
                    break;
                case 3:
                    enterFirstName();
                    break;
                case 4:
                    enterLastName();
                    break;
                case 5:
                    modifyItem();
                    break;
                case 6:
                    removeItem();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    private static void menu(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To view menu.");
        System.out.println("\t 1 - To print the items of the array.");
        System.out.println("\t 2 - To add cell phone number.");
        System.out.println("\t 3 - To add first name.");
        System.out.println("\t 4 - To add last name.");
        System.out.println("\t 5 - To modify an item.");
        System.out.println("\t 6 - To remove an item.");
        System.out.println("\t 7 - To quit.");

    }


    private static void removeItem() {
        System.out.println("Enter item to remove: \r");
        contact.removeItem(scanner.nextLine());
    }

    private static void modifyItem() {
        System.out.println("Enter and item name to modify: \r");
        String oldItem = scanner.nextLine();
        System.out.println("Enter new item value: \r");
        String newItem = scanner.nextLine();
        contact.modifyItem(oldItem, newItem);
    }

    private static void enterLastName() {
        System.out.println("Enter last name: \r");
        contact.setLastName(scanner.nextLine());
    }

    private static void enterFirstName() {
        System.out.println("Enter first name: \r");
        contact.setFirstName(scanner.nextLine());
    }

    private static void enterCellPhone() {
        System.out.println("Enter a cell phone number: \r");
        String cellPhone = scanner.nextLine();
        contact.addCellPhone(cellPhone);

    }


}
