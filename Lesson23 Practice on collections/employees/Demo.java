package employees;

public class Demo {

	public static void main(String[] args) {
		
		Company company = new Company("Reaver Ltd");
		
		Employee sasho = new Employee("Alexander", 27, 1000);
		Employee jessy = new Employee("Jessy", 22, 1200);
		Employee canko1 = new Employee("Canko", 23, 900);
		Employee canko2 = new Employee("Canko", 23, 900);
		Employee silva = new Employee("Silva", 30, 1100);
		
		company.addEmployee("Logistics", canko1);
		company.addEmployee("Logistics", canko2);
		company.addEmployee("Sales", jessy);
		company.addEmployee("Sales", silva);
		company.addEmployee("IT", canko2);
		company.addEmployee("IT", sasho);
		company.addEmployee("IT", jessy);
		company.addEmployee("IT", canko1);
		
		company.printEmployees();
		System.out.println("===========================");
		company.printEmpsSortedByName();
		System.out.println("===========================");
		company.printEmpsSortedByAge();
		System.out.println("===========================");
		company.printEmpsSortedBySalary();
		System.out.println("===========================");
		System.out.println("===========================");
		System.out.println("===========================");
		company.printEmployees();
		System.out.println("===========AFTER FILTERING===========");
		company.filterEmployees();
		company.printEmployees();
	
	}
}
