package classes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TaskTest {


	@Test
	void test() {
		Task task = new Task("1234", "Clean Room", "Make bed, pick up laundry, fold clothes");
		assertTrue(task.getId().equals("1234"));
		assertTrue(task.getName().equals("Clean Room"));
		assertTrue(task.getDescription().equals("Make bed, pick up laundry, fold clothes"));
	}
	
	@Test
	void testIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345654212", "Clean Room", "Make bed, pick up laundry, fold clothes");
		});
	}
	
	@Test
	void testNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234", "Clean Room and Living Room", "Make bed, pick up laundry, fold clothes");
		});
	}
	
	@Test
	void testDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234", "Clean Room", "Make bed, pick up laundry, fold clothes, pick up trash");
		});
	}
	
	@Test
	void testIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Clean Room", "Make bed, pick up laundry, fold clothes");
		});
	}
	
	@Test
	void testNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234", null, "Make bed, pick up laundry, fold clothes");
		});
	}
	
	@Test
	void testDescriptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234", "Clean Room", null);
		});
	}


	
}
