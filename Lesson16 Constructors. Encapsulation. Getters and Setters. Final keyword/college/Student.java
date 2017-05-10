package college;

public class Student {
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;
	
	Student(){
		grade = 4.0;
		yearInCollege = 1;
		isDegree = false;
		money = 0.0;
	}
	
	Student(String name, int age, String subject){
		this();
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	public String getName() {
		return this.name;
	}

	public String getSubject() {
		return this.subject;
	}

	public double getGrade() {
		return this.grade;
	}

	public int getYearInCollege() {
		return this.yearInCollege;
	}

	public int getAge() {
		return this.age;
	}

	public boolean getIsDegree() {
		return isDegree;
	}

	public double getMoney() {
		return money;
	}
	
	public void setGrade(double grade) {
		if(grade >= 2.0 && grade <= 6.0){
			this.grade = grade;
		}
		else{
			System.out.println("Invalid grade!");
		}
	}

	void upYear(){
		if(!isDegree){
			this.yearInCollege++;
		}
		else{
			System.out.println(this.name + " has already graduated!");
		}
		if(yearInCollege == 4){
			this.isDegree = true;
		}
	}
	
	double receiveScholarship(double min, double amount){
		if(this.age < 30 && this.grade >= min){
			this.money += amount;
		}
		else{
			System.out.println(this.name + " does NOT qualify for a scholarship!");
		}
		System.out.print("The total amount of money " + this.name + " has earned is ");
		return this.money;
	}
	
}
