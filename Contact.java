
public class Contact {
//Declare relevant variables
public static String contact_ID;
public static String contact_firstname;
public static String contact_lastname;
public static String contact_phone;
public static String contact_address;


//Creating a string that will throw an exception if any of the fields are null 
//or an inappropriate length.
public Contact (String contact_ID, String contact_firstname, String contact_lastname, 
		String contact_phone, String contact_address) {
	if (contact_ID == null || contact_ID.length()>10) {
		throw new IllegalArgumentException("Invalid ID");
	}
	if (contact_firstname == null || contact_firstname.length()>10) {
		throw new IllegalArgumentException("Invalid first name");
	}
	if (contact_lastname == null || contact_lastname.length()>10) {
		throw new IllegalArgumentException("Invalid last name");
	}
	if (contact_phone == null || contact_phone.length()>10 || contact_phone.length()<10) {
		throw new IllegalArgumentException("Invalid phone number");
	}
	if (contact_address == null || contact_address.length()>30) {
		throw new IllegalArgumentException("Invalid address");
	}
	this.contact_ID = contact_ID;
	this.contact_firstname = contact_firstname;
	this.contact_lastname = contact_lastname;
	this.contact_phone = contact_phone;
	this.contact_address = contact_address;
}

public String getID() {
	return contact_ID;
}
public String getfirstname() {
	return contact_firstname;
}
public String getlastname() {
	return contact_lastname;
}
public String getphone() {
	return contact_phone;
}
public String getaddress() {
	return contact_address;
}
public Contact deleteContact(Contact contactrecord) {
	return null;
}
}