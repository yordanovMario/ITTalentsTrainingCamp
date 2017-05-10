package office;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeftEmployee;
	private static AllWork allWork;
	
	public static AllWork getAllWork() {
		return Employee.allWork;
	}

	public static void setAllWork(AllWork allWork) {
		if(allWork != null){
			Employee.allWork = allWork;
		}
	}

	public Employee(String name){	
		this.setName(name);
		this.setHoursLeftForEmployee(8);
		if(!allWork.isAllWorkDone()){
			this.currentTask = allWork.getNextTask();
		}
	}

	public Task getCurrentTask() {
		return this.currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if(!currentTask.getName().isEmpty()){
			this.currentTask = currentTask;
		}
	}

	public int getHoursLeftForEmployee() {
		return this.hoursLeftEmployee;
	}

	public void setHoursLeftForEmployee(int hoursLeftForEmployee) {
		if(hoursLeftForEmployee >= 0 && hoursLeftForEmployee <= 15){
			this.hoursLeftEmployee = hoursLeftForEmployee;
		}
		else{
			return;
		}
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if(!name.isEmpty()){
			this.name = name;
		}
		else{
			System.out.println("Invalid name!");
		}
	}

	private void showReport(){
		System.out.println("Employee: " + this.getName());
		System.out.println("Task: " + this.currentTask.getName());
		System.out.println("Working hours left for employee: " + this.getHoursLeftForEmployee());
		System.out.println("Working hours left for task: " + this.currentTask.getWorkingHours());
	}
	
	void work(){
		if(this.currentTask == null){
			return;
		}
		if(this.currentTask.getWorkingHours() >= this.getHoursLeftForEmployee()){
			this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.getHoursLeftForEmployee());
			allWork.setTaskHours(currentTask, this.currentTask.getWorkingHours() - this.getHoursLeftForEmployee());
			this.setHoursLeftForEmployee(0);
		}
		else{
			this.setHoursLeftForEmployee(this.getHoursLeftForEmployee() - this.currentTask.getWorkingHours());
			this.currentTask.setWorkingHours(0);
			allWork.setTaskHours(currentTask, 0);
			if(!allWork.isAllWorkDone()){
				this.currentTask = allWork.getNextTask();
				work();
			}
		}
		//this.showReport();
		startWorkingDay();
	}
	
	void startWorkingDay(){
		setHoursLeftForEmployee(8);
	}
	
}
