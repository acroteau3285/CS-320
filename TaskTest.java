import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
	@Test
	void testNewTask() {
		Task task = new Task("0000000001", "Amber", "Stepmother");
		assertTrue(contact.getname().equals("Amber"));
		assertTrue(contact.getid().equals("0000000001"));
	}
	void testnametoolong() {
		Assertions.assertThrows(IllegalArgumentException.name, () -> {
			new Task("0000000002", "Rose Maria Theresa Adams Signavario", "Helper");}
			); };	
			
	void testdesc() {
		Assertions.assertThrows(IllegalArgumentException.desc, () -> {
			new Contact("0000000003", "Alejandra", "She was the one girl I met in college through Dean");}
			); };

}
