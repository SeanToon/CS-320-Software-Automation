package classes;

public class Task{
	
	private String Id;
	private String name;
	private String description;
	
		
	public Task(String Id, String name, String description) {
		if(Id == null || Id.length()>10) {
			throw new IllegalArgumentException("Invalid Id");
		}
		if(name == null || name.length()>20) {
			throw new IllegalArgumentException("Invalid Task Name");
		}
		if(description == null || description.length()>50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		this.Id = Id;
		this.name = name;
		this.description = description;
	}
	

	public String getId() {
		return Id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name == null || name.length()>20) {
			throw new IllegalArgumentException("Invalid Task Name");
		}
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		if(description == null || description.length()>50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		this.description = description;
	}

}
