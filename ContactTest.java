import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testNewContact() {
		Contact contact = new Contact("0000000001", "Amber", "Hart", "4132430330", "480 Pleaseant Street");
		assertTrue(contact.getfirstname().equals("Amber"));
		assertTrue(contact.getID().equals("0000000001"));
	}
	void testPhoneNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.contact_phone, () -> {
			new Contact("0000000002", "Rose", "Whitman", "2430330", "480 Pleasant Street");}
			); };	
	void testNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.contact_lastname, () -> {
			new Contact("0000000003", "Alejandra", "Sweetin-Lopez", "4132430330", "480 Pleasant Street");}
			); };
	void testAddresstoolong() {
		Assertions.assertThrows(IllegalArgumentException.contact_address, () -> {
			new Contact("0000000004", "Rose", "Whitman", "4132430330", "721 South Washington State Road Washington MA");}
			); };
	void testfirstname() {
		Assertions.assertThrows(IllegalArgumentException.contact_firstname, () -> {
			new Contact("0000000004", "Alejandra Jane", "Whitman", "4132430330", "480 Pleasant Street");}
			); };
}
