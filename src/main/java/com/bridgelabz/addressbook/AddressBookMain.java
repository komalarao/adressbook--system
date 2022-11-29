package com.bridgelabz.addressbook;
import java.util.Scanner;
public class AddressBookMain {
	static Scanner scannerObject = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("---------- Welcome To Address Book Program!! ----------");
		AddressBook addressBook = new AddressBook();
        addressBook.operation();
	}

	
}
