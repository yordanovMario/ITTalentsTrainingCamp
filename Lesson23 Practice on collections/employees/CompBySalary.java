package employees;

import java.util.Comparator;

public class CompBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		double razlika = o1.getSalary() - o2.getSalary();
		return razlika > 0 ? 1 : (razlika < 0 ? -1 : 0);
	}
}