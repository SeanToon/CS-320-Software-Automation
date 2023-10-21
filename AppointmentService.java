package classes;
import java.util.ArrayList;
import java.util.List;

public class AppointmentService {
	private List<Appointment> appointments;
	
	public AppointmentService() {
		appointments = new ArrayList<>();
	}
	
	public void addAppointment(Appointment appointment) {
		for(Appointment existingAppointment : appointments) {
			if(existingAppointment.getId().equals(appointment.getId())) {
				throw new IllegalArgumentException("Duplicate appointment Id");
			}
		}
		appointments.add(appointment);
	}
	
	public void deleteAppointment(String Id) {
		for(Appointment appointment : appointments) {
			if (appointment.getId().equals(Id)) {
				appointments.remove(appointment);
				return;
			}
		}
		throw new IllegalArgumentException("Appointment Id not found");
	}

}
