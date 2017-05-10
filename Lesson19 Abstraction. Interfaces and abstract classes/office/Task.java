package office;

public abstract class Task {
	private String name;
	private int workingHours;
	
	Task(String name, int workingHours){
		this.setName(name);
		this.setWorkingHours(workingHours);
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if(!name.isEmpty()){
			this.name = name;
		}
	}

	public int getWorkingHours() {
		return this.workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if(workingHours >= 0){
			this.workingHours = workingHours;
		}
		else{
			System.out.println("Invalid working hours.");
			return;
		}
	}
	
}
