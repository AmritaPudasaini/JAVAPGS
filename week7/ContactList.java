import java.util.Scanner;

class Contact{
    String name;
    String phone;
    Contact next;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.next = null;
    }
}
class ContactList{
    private Contact head;

    public void addContact (String name, String phone){
        Contact newContact = new Contact(name, phone);
        if (head == null){
            head = newContact;
        } else{
            Contact current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next=new.Contact
        }
        System.out.println("Contact added successfully.");
    }
}

public void searchContact(String name) {
        Contact current = head;
        boolean found = false;
        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                System.out.println("Found: " + current.name + " - " + current.phone);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
}

public void displayContacts(){
    if (head==null){
        System.out.println("Contact list is empty");
        return;
    }
    System.out.println("All Contacts: ");
    Contact current = head;
    while (current != null) {
        System.out.println(current.name + " - " + current.phone);
        current = current.next;
    }
}


