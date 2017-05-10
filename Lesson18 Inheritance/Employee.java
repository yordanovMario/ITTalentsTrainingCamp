
public class Employee extends Person{
	
	private double daySalary;
	
	Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		if(daySalary > 0){
			this.daySalary = daySalary;
		}
	}

	public double getDaySalary() {
		return this.daySalary;
	}

	public void setDaySalary(double daySalary) {
		if(daySalary > 0){
			this.daySalary = daySalary;
		}
	}
	
	double calculateOvertime(double hours){
		double overTime = 0;
		if(hours > 0){
			if(this.getAge() < 18){
				overTime = 0;
			}
			else{
				overTime = (this.daySalary/8) * 1.5;
			}
		}
		System.out.print(this.getName() + "'s overtime earnings: ");
		return overTime;
	}
	
	void showEmployeeInfo(){
		this.showPersonInfo();
		System.out.println("Day salary: " + this.daySalary);
		System.out.println();
	}
	
	
}
