package com.addressbook;

import java.util.ArrayList;

public class UserInterface {
    public void print(ArrayList contactList) {
        for(int i = 0; i < contactList.size(); i++) {
            System.out.println(contactList.get(i));
        }
    }
}
