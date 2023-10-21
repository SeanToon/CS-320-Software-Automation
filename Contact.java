package contact;

public class Contact{
	
	private String Id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
		
	public Contact(String Id, String firstName, String lastName, String phoneNumber, String address) {
		if(Id == null || Id.length()>10) {
			throw new IllegalArgumentException("Invalid Id");
		}
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if(phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.Id = Id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public String getId() {
		return Id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		this.lastName = lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.address = address;
	}
}

