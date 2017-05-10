package office;

public class Demo {

	public static void main(String[] args) {
		
		AllWork allWork = new AllWork();
		allWork.addTask(new Painting("Paint Walls", 10));
		allWork.addTask(new Painting("Paint Walls", 10));
		allWork.addTask(new Painting("Paint Walls", 10));
		allWork.addTask(new Painting("Paint Walls", 10));
		allWork.addTask(new Painting("Paint Walls", 10));
		allWork.addTask(new Cleaning("Cleaning Garden", 9));
		allWork.addTask(new Cleaning("Cleaning Garden", 8));
		allWork.addTask(new Cleaning("Cleaning Garden", 8));
		allWork.addTask(new Cleaning("Cleaning Garden", 9));
		allWork.addTask(new Cleaning("Cleaning Garden", 8));
		
		Employee.setAllWork(allWork);
		
		Employee[] employees = new Employee[4];
		employees[0] = new Employee("Ivan");
		employees[1] = new Employee("Dragan");
		employees[2] = new Employee("Gosho");
		employees[3] = new Employee("Pesho");
		
		while(true){
			for(int i = 0; i < employees.length; i++) {
				if(employees[i] != null){
					employees[i].work();
				}
			}
			if(Employee.getAllWork().isAllWorkDone()){
				break;
			}
		}
		
	}

}
