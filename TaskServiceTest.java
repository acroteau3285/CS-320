import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TaskServiceTest {
	@Test
	void addTask() {
		Task task = new Task("0000000001", "Amber", "Stepmom");
		assertTrue(task.getname().equals("Amber"));
		assertTrue(task.getdesc().equals("Stepmom"));
	}
	void testdeletetask() {
		Task task = new Task("0000000002", "Rose", "Helper");
		TaskService.deleteTask();
	};	
	void testname() {
		Task task = new Task("0000000002", "Rose", "Helper");
		TaskService.updatename();
	};	
	void testdesc() {
		Task task = new Task("0000000002", "Rose", "Helper");
		TaskService.updatedesc();
	};	
}
