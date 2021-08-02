import java.util.Scanner;

public class TaskService {
	Scanner first = new Scanner(System.in);
	Scanner descrip = new Scanner(System.in);
	
	public Task addContact() {
		Task taskRecord = new Task(null, null, null);
		return taskRecord;
	}
	public static Task deleteTask() {
		taskRecord = taskRecord.deleteTask(taskRecord);
		return null;
	}
	public static Task updateName() {
		String first = first.nextLine();
		Task.name = first;
	}
	public static Task updateDesc() {
		String descrip = descrip.nextLine();
		Task.desc = descrip;
	}
}
