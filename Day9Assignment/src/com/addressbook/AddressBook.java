package com.addressbook;

import java.util.ArrayList;

public class AddressBook {
    private ArrayList contactList = new ArrayList();

    public void add(Contact contact) {
        contactList.add(contact);
    }

    public ArrayList getContactList(){
        return contactList;
    }
}
