import java.sql.Date;

public class Appointment {
public static String app_ID;
public static Date app_date;
public static String app_desc;

public Appointment (String app_ID, Date app_date) {
	if (app_ID == null || app_ID.length()>10) {
		throw new IllegalArgumentException("Invalid ID");
	}
	if (app_date == null || app_date.before(new Date(0))) {
		throw new IllegalArgumentException("Invalid Date");
	}
	if (app_desc == null || app_desc.length()>50) {
		throw new IllegalArgumentException("Invalid Description");
	}
	Appointment.app_ID = app_ID;
	Appointment.app_date = app_date;
	Appointment.app_desc = app_desc;
}

public String getID() {
	return app_ID;
}
public Date getdate() {
	return app_date;
}
public String getdesc() {
	return app_desc;
}
public Contact deleteAppointment(Appointment apprecord) {
	return null;
}
}
