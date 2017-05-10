package work;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeftEmployee;
	
	public Employee(String name){	
		this.setName(name);
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
		if(this.currentTask != null){
			if(this.currentTask.getWorkingHours() >= this.getHoursLeftForEmployee()){
				this.currentTask.setWorkingHours(currentTask.getWorkingHours() - this.getHoursLeftForEmployee());
				this.setHoursLeftForEmployee(0);
			}
			else{
				this.setHoursLeftForEmployee(this.getHoursLeftForEmployee() - this.currentTask.getWorkingHours());
				this.currentTask.setWorkingHours(0);
			}
			this.showReport();
		}
		else{
			return;
		}
	}
	
}
