
public class Demo {

	public static void main(String[] args) {
		
		Person[] group = new Person[10];
		Person gabi = new Person("Gabi", 20, false);
		Person ivan = new Person("Ivan", 26, true);
		//Student ivancho = new Student(); nevazmojno zashtoto nqma zapisan defaulten konstruktor a samo tozi s vsichki parametri.
		Student dragan = new Student("Dragan", 22, true, 4);
		Employee donald = new Employee("Donald", 50, true, 5000);
		Employee radka = new Employee("Radka", 17, false, 20.5);
		group[0] = gabi;
		group[1] = ivan;
		group[2] = dragan;
		group[3] = donald;
		group[4] = radka;
		
		for (int i = 0; i < group.length; i++) {
			if(group[i] != null){
				if(group[i] instanceof Student){
					((Student)group[i]).showStudentInfo();
				}
				else{ 
					if(group[i] instanceof Employee){
						((Employee)group[i]).showEmployeeInfo();
					}
					else{
						group[i].showPersonInfo();
						System.out.println();
					}
				}
			}
		}
		
		for (int i = 0; i < group.length; i++) {
			if(group[i] instanceof Employee){
				double earnings = ((Employee)group[i]).calculateOvertime(2);
				System.out.println(earnings);
			}
		}
	}

}
