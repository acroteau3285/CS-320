import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void addContact() {
		Contact contact = new Contact("0000000001", "Amber", "Hart", "4132430330", "480 Pleaseant Street");
		assertTrue(contact.getfirstname().equals("Amber"));
		assertTrue(contact.getID().equals("0000000001"));
	}
	void testdeleteontact() {
		Contact contact = new Contact("0000000002", "Rose", "Whitman", "4132430330", "480 Pleasant Street");
		ContactService.deleteContact();
	};	
	void testfirst() {
		Contact contact = new Contact("0000000002", "Rose", "Whitman", "4132430330", "480 Pleasant Street");
		ContactService.updatefirst();
	};	
	void testlast() {
		Contact contact = new Contact("0000000002", "Rose", "Whitman", "4132430330", "480 Pleasant Street");
		ContactService.updatelast();
	};	
	void testdigits() {
		Contact contact = new Contact("0000000002", "Rose", "Whitman", "4132430330", "480 Pleasant Street");
		ContactService.updatedigits();
	};	
	void testaddress() {
		Contact contact = new Contact("0000000002", "Rose", "Whitman", "4132430330", "480 Pleasant Street");
		ContactService.updateaddress();
	};	
}
