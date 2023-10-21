package classes;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TaskServiceTest {
	
	private TaskService task;
	
	@BeforeEach
    void setUp() {
        task = new TaskService();
    }

    @Test
    void addTask() {
    }

    @Test
    void deleteContact() {
    }

    @Test
    void updateContact() {
    }
    
    @Test
    void testSize() {
        assertEquals(0, task.size());

        Task task1 = new Task("1234", "Clean Car", "Wipe windows");
        Task task2 = new Task("1235", "Clean Room", "Make bed, pick up laundry, fold clothes");

        task.addTask(task1);
        task.addTask(task2);

        assertEquals(2, task.size());

        task.deleteTask("1234");
        assertEquals(1, task.size());

        task.deleteTask("1235");
        assertEquals(0, task.size());
    }


    @Test
    void testAddAndUpdateTest() {
        assertEquals(0, task.size());

        Task task3 = new Task("1234", "Clean Room", "Make bed, pick up laundry, fold clothes");
        task.addTask(task3);
        assertEquals(1, task.size());

        task.updateTaskNameById("1234", "Clean Living Room");
        task.updateTaskDescription("1234", "Clean couch, vaccum rug");

        Task updatedTask = task.getTaskById("1234");
        assertEquals("Clean Living Room", updatedTask.getName());
        assertEquals("Clean couch, vaccum rug", updatedTask.getDescription());
    }

}
