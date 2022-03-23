package com.addressbook;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

        System.out.println("Welcome to Address Book Program");

        Contact contact1 = new Contact("Kalimuthu");
        Contact contact2 = new Contact("Geetha");

        contact1.lastName = "Ramachandran";
        contact1.address = "25, Bharathiyar 4th street, S.s.colony";
        contact1.city = "Madurai";
        contact1.state = "Tamilnadu";
        contact1.pinCode = 625016;
        contact1.phoneNumber = 7402181662L;
        contact1.emailId = "kalir888@gmail.com";

        contact2.lastName = "Muthukumar";
        contact2.address = "25, Bharathiyar 4th street, S.s.colony";
        contact2.city = "Madurai";
        contact2.state = "Tamilnadu";
        contact2.pinCode = 625016;
        contact2.phoneNumber = 9345667724L;
        contact2.emailId = "rskgeethastores@gmail.com";

        AddressBook addressBook = new AddressBook();
        addressBook.add(contact1);
        addressBook.add(contact2);


        UserInterface userInterface = new UserInterface();
        ArrayList contactList = addressBook.getContactList();
        System.out.println("printing before editing the contact list");
        userInterface.print(contactList);

        addressBook.edit("Kalimuthu","Ramachandran", "Rengasamy",
                "25, Bharathiyar 4th street, S.s.colony", "Madurai", "Tamilnadu",
                "rskgeethastores@gmail.com", 9790295762L, 625016);
        System.out.println("printing after editing the contact list");
        userInterface.print(contactList);
    }
}
