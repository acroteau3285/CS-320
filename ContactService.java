
import java.util.Scanner;
public class ContactService {

	@SuppressWarnings("unused")
	private static Contact contactrecord;
	Scanner first = new Scanner(System.in);
	Scanner last = new Scanner(System.in);
	Scanner digits = new Scanner(System.in);
	Scanner address = new Scanner(System.in);
	
	public Contact addContact() {
		contactrecord = new Contact(null, null, null, null, null);
		return contactrecord;
	}
	public static Contact deleteContact() {
		contactrecord = contactrecord.deleteContact(contactrecord);
		return null;
	}
	public static Contact updatefirst() {
		String first = first.nextLine();
		Contact.contact_firstname = first;
	}
	public static Contact updatelast() {
		String last = last.nextLine();
		Contact.contact_lastname = last;
	}
	public static Contact updatedigits() {
		String digits = digits.nextLine();
		Contact.contact_phone = digits;
	}
	public static Contact updateaddress() {
		String address = address.nextLine();
		Contact.contact_address = address;
	}
	
}