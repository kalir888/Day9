package com.addressbook;

public class Main {
    public static void main(String args[]) {

        System.out.println("Welcome to Address Book Program");

        Contact contact1 = new Contact();
        Contact contact2 = new Contact();

        AddressBook addressBook = new AddressBook();
        addressBook.add(contact1);
        addressBook.add(contact2);
    }
}
