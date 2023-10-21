package classes;
import java.util.ArrayList;
public class TaskService{
	
	ArrayList<Task> tasks = new ArrayList<Task>();
	
	public void addTask(Task newTask){
		for(int i = 0; i < tasks.size(); i++) {
			if(tasks.get(i).getId().equals(newTask.getId())) {
				throw new IllegalArgumentException("ID is not unique");
	            }
	        }
		tasks.add(newTask);   
	    }
	    
	public void deleteTask(String Id) {
	    for(int i = 0; i < tasks.size(); i++) {
	    	if(tasks.get(i).getId().equals(Id)){
	    		tasks.remove(i);
	    		}
	    	}
	    }
	    
	public void updateTaskNameById(String Id, String name) {
		for (int i = 0; i < tasks.size(); i++) {
			if(tasks.get(i).getId().equals(Id)) {
				tasks.get(i).setName(name);
			}
		}
	}
	public void updateTaskDescription(String Id, String description) {
		for (int i = 0; i < tasks.size(); i++) {
			if(tasks.get(i).getId().equals(Id)) {
				tasks.get(i).setDescription(description);
			}
		}
	}
	
	public Task getTaskById(String Id) {
        for (Task task : tasks) {
            if (task.getId().equals(Id)) {
                return task;
            }
        }
		return null;
    }

	 public int size() {
        return tasks.size();
    }


}
