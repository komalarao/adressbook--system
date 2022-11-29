package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.iterator;
	
public class AddressBook implements AddressBookIF {

	ArrayList<ContactPerson> contactList = new ArrayList<ContactPerson>();
	
	public void addContact(ContactPerson person) {
        contactList.add(person);
    }
    public void displayContents() {

        Iterator<ContactPerson> iterator = contactList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


