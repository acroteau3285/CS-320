import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppointmentServiceTest {

	@Test
	void testNewAppointment() {
		Appointment appointment = new Appointment("0000000001", "10/10/21", "Dental Filling");
		assertTrue(appointment.getID().equals("0000000001"));
		assertTrue(appointment.getdate().equals("10/10/21"));
	}
	void testDateTooEarly() {
		Assertions.assertThrows(IllegalArgumentException.app_date, () -> {
			new Appointment("0000000002", "5/10/21", "Nail Salon");}
			); };	
	void testDescTooLong() {
		Assertions.assertThrows(IllegalArgumentException.app_desc, () -> {
			new Appointment("0000000003", "10/10/21", "Meeting on Main Street with Alejandra and George to discuss things");}
			); };
}
