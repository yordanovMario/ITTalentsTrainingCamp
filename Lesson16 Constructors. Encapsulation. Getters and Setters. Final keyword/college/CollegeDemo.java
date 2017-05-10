package college;

public class CollegeDemo {

	public static void main(String[] args) {
		StudentGroup accounting = new StudentGroup("Accounting");
		StudentGroup finances = new StudentGroup("Finances");
		Student ivan = new Student("Ivan", 19, "Accounting");
		Student dragan = new Student("Dragan", 23, "Accounting");
		Student pesho = new Student("Pesho", 22, "Finances");
		Student gosho = new Student("Gosho", 21, "Finances");
		
		accounting.addStudent(ivan);
		accounting.addStudent(gosho);
		accounting.addStudent(dragan);
		finances.addStudent(pesho);
		finances.addStudent(gosho);
		pesho.setGrade(5.50);
		System.out.println();
		System.out.println(pesho.receiveScholarship(5, 155.90));
		System.out.println(dragan.receiveScholarship(5.20, 220));
		ivan.upYear();
		gosho.upYear();
		System.out.println();
		accounting.theBestStudent();
		finances.theBestStudent();
		System.out.println();
		accounting.printStudentsInGroup();
		System.out.println();
		finances.printStudentsInGroup();
	}

}
