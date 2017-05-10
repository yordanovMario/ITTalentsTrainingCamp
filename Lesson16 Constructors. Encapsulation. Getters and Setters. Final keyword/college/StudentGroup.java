package college;

public class StudentGroup {
	private String groupSubject;
	private Student[] students;
	private int freePlaces;
	private int indexFree = 0;
	private int indexMaxGrade = 0;
	
	StudentGroup(){
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	StudentGroup(String subject){
		this();
		this.groupSubject = subject;
	}
	
	public void addStudent(Student s){
		if(this.freePlaces > 0 && s.getSubject().equals(this.groupSubject)){
			this.students[this.indexFree] = s;
			this.freePlaces--;
			this.indexFree++;
		}
		else{
			System.out.println(s.getName() + " can NOT be added to this students group!");
		}
	}
	
	void emptyGroup(){
		this.students = null;
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	void theBestStudent(){
		for(int i = 1; i < this.students.length; i++){
			if(this.students[i]!=null){
				if(this.students[i].getGrade() > this.students[i-1].getGrade()){
					this.indexMaxGrade = i;
				}
			}
		}
		System.out.println("The best student in the group is " + this.students[indexMaxGrade].getName() + ".");
	}
	
	void printStudentsInGroup(){
		System.out.println("Students in group " + this.students[0].getSubject() + ":");
		for(int i = 0; i < this.students.length; i++){
			if(this.students[i]!=null){
				System.out.println(this.students[i].getName());
				System.out.println("Age: " + this.students[i].getAge());
				System.out.println("Subject: " + this.students[i].getSubject());
				System.out.println("Year in college: " + this.students[i].getYearInCollege());
				System.out.println("Grade: " + this.students[i].getGrade());
				System.out.println("Money earned from scholarships: " + this.students[i].getMoney() + " BGN.");
				System.out.println("Graduated: " + this.students[i].getIsDegree());
				System.out.println();
			}
		}
	}
	
}
