
public class Student extends Person{
	
	private double score;
	
	Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		if(score >= 2 && score <= 6){
			this.score = score;
		}
	}
	
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	void showStudentInfo(){
		this.showPersonInfo();
		System.out.println("Score: " + this.score);
		System.out.println();
	}
	
	
}
