package work;

public class WorkDemo {

	public static void main(String[] args) {
		Task task1 = new Task("Painting", 7);
		Employee gosho = new Employee("Gosho");
		gosho.setCurrentTask(task1);
		gosho.setHoursLeftForEmployee(8);
		gosho.work();
	}

}
