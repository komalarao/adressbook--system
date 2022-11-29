package com.bridgelabz.addressbook;

public class AddressBookMain {
	public static void main(String[] args) {
		ContactPerson person = new ContactPerson();
		Address address = new Address();
		Scanner scannerObject = new Scanner(System.in);

		System.out.println("Enter First Name: ");
		String firstName = scannerObject.next();

		System.out.println("Enter Last Name: ");
		String lastName = scannerObject.next();

		System.out.println("Enter Phone Number: ");
		long phoneNumber = scannerObject.nextLong();

		System.out.println("Enter Email: ");
		String email = scannerObject.next();

		System.out.println("Enter City: ");
		String city = scannerObject.next();

		System.out.println("Enter State: ");
		String state = scannerObject.next();

		System.out.println("Enter Zip Code: ");
		long zipCode = scannerObject.nextLong();

		scannerObject.close();

		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setPhoneNumber(phoneNumber);
		person.setEmail(email);
		address.setCity(city);
		address.setState(state);
		address.setZip(zipCode);
		person.setAddress(address);
		AddressBook addressBook = new AddressBook();
		addressBook.addContact(person);
		addressBook.displayContents();
	}
}
