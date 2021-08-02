import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppointmentTest {

	@Test
	void addAppointment() {
		Appointment appointment = new Appointment("0000000001", "10/10/21", "Dental Filling");
		assertTrue(appointment.getID().equals("0000000001"));
		assertTrue(appointment.getdate().equals("10/10/21"));
	}
	void testdeleteontact() {
		Appointment appointment = new Appointment("0000000002", "10/12/21", "Math Class");
		AppointmentService.deleteAppointment();
}}