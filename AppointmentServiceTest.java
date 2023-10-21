package classes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentServiceTest {
	private AppointmentService appointmentService;
	
	@BeforeEach
	void setUp() {
		appointmentService = new AppointmentService();
	}
	
	@Test
	void testAddValidAppointment() {
		Date futureDate = new Date(System.currentTimeMillis()+ 10000);
		Appointment newAppointment = new Appointment("12345", futureDate ,"Teeth Cleaning");
		
		try {
		    appointmentService.addAppointment(newAppointment);
		} catch (Exception e) {
		    fail("An invalid exception is thrown");
		}
	}
	
	@Test 
	void testAddDuplicateAppointment() {
		Date futureDate = new Date(System.currentTimeMillis()+ 10000);
		Appointment newAppointment = new Appointment("12345", futureDate ,"Teeth Cleaning");
		
		appointmentService.addAppointment(newAppointment);
		
		Appointment duplicateAppointment = new Appointment("12345", futureDate ,"Teeth Cleaning");
		
		assertThrows(IllegalArgumentException.class, () -> appointmentService.addAppointment(duplicateAppointment));
	}
	
	@Test
	void testDeleteAppointment() {
		Date futureDate = new Date(System.currentTimeMillis() + 10000);
		Appointment appointment = new Appointment("12345", futureDate ,"Teeth Cleaning");
		
		appointmentService.addAppointment(appointment);
		appointmentService.deleteAppointment("12345");
		
		assertThrows(IllegalArgumentException.class, () -> appointmentService.deleteAppointment("12345"));
	}
	
	@Test 
	void testDeleteNonexistingAppointment(){
		assertThrows(IllegalArgumentException.class, () -> appointmentService.deleteAppointment("Id that doesnt exist"));
	}
	
	
	
}
