package classes;
import java.util.Date;

public class Appointment {
	private String Id;
	private Date date;
	private String description;
	
	public Appointment(String Id, Date date, String description) {
		if (Id == null || Id.length()>10) {
			throw new IllegalArgumentException("Invalid Id");
		}
		if(date.before(new Date())) {
			throw new IllegalArgumentException("Appointment date cannot be before current date");
		}
		if(description == null || description.length()> 50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		this.Id = Id;
		this.date = date;
		this.description = description;
	}
	
	public String getId() {
		return Id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		if(date.before(new Date())) {
			throw new IllegalArgumentException("Appointment date cannot be before current date");
		}
		this.date = date;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		if(description == null || description.length()> 50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		this.description = description;
	}
}
