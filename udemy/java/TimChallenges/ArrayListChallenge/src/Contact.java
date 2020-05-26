import java.lang.invoke.LambdaConversionException;
import java.util.ArrayList;

public class Contact extends ContactName{
    private ArrayList<String> contactList = new ArrayList<>();

    public void setFirstName(String firstName){
        int index = search(firstName);
        if(index < 0) {
            this.addFirstName(contactList, firstName);
        }
    }

    public void setLastName(String lastName){
        int index = search(lastName);
        if(index < 0 ) {
            this.addLastName(contactList, lastName);
        }
    }

    public void addCellPhone(String cellPhone){
        int index = search(cellPhone);
        if(index < 0) {
            contactList.add(cellPhone);
        }
    }

    public void modifyItem(String itemName, String newItem){
        int index = search(itemName);
        if (index >= 0){
            modifyItem(index, newItem);
        }
    }

    private void modifyItem(int index, String newItem){
        contactList.set(index, newItem);
        System.out.println("Item has been changed to " + newItem);
    }

    public void removeItem(String itemName){
        int index = search(itemName);
        if(index >= 0){
            removeItem(index);
        }
    }

    private void removeItem(int index){
        contactList.remove(index);
        System.out.println("Item has been removed.");
    }

    public void searchItem (String item){
        int index = search(item);
        if(index >= 0){
            System.out.println(item + " is in the list.");
        }else {
            System.out.println(item + " is not in the list.");
        }
    }

    private int search(String item){
        return contactList.indexOf(item);
    }

    public void printItems() {
        int i = 1;
        for(String item: contactList){
            System.out.println(i + " " + item);
            i++;
        }

    }
}
