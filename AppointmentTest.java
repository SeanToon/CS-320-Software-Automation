package classes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppointmentTest {
	private Appointment appointment;
	
	@Test
	void testCheckValues() {
		Appointment newAppointment = new Appointment("12345", new Date() ,"Teeth Cleaning");
		assertTrue(newAppointment.getId().equals("12345"));
		assertTrue(newAppointment.getDescription().equals("Teeth Cleaning"));
	}
	
	@BeforeEach
	void setUp() {
		appointment = new Appointment("12345", new Date(), "Teeth Cleaning");
	}
	
	@Test 
	void testAddAppointment(){
		assertNotNull(appointment);
	}
	
	@Test
	void testAppointmentDateInPast() {
		Date pastDate = new Date(System.currentTimeMillis() - 10000);
		assertThrows(IllegalArgumentException.class, () -> appointment.setDate(pastDate));
	}
	
	@Test
	void testInvalidDescription() {
	    assertThrows(IllegalArgumentException.class, () -> appointment.setDescription(null));
	    assertThrows(IllegalArgumentException.class, () -> appointment.setDescription("If the description is more that 50 characters like this... it will fail!!"));
	    }

}
