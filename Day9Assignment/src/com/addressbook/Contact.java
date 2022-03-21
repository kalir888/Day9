package com.addressbook;

public class Contact {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    long pinCode;
    long phoneNumber;
    String emailId;

    public Contact(String name){
        firstName = name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode=" + pinCode +
                ", phoneNumber=" + phoneNumber +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
