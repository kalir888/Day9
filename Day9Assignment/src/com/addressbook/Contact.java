package com.addressbook;

public class Contact {
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public long pinCode;
    public long phoneNumber;
    public String emailId;

    public Contact(String name) {
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
