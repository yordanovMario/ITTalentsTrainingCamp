package employees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class Company {

	private String name;
	private HashMap<String, HashSet<Employee>> emps;//department -> list of emps
	private HashMap<String, HashMap<Employee, LinkedHashMap<String, Double>>> empsWithSalaries;
	
	public Company(String name) {
		if(name != null && !name.isEmpty())
			this.name = name;
		else
			this.name = "Phantom Company";
		emps = new HashMap<String, HashSet<Employee>>();
		//test filling
		empsWithSalaries = new HashMap<>();
		empsWithSalaries.put("Sales", new HashMap<>());
		Employee jessy = new Employee("Jessy", 22, 1200);
		Employee canko = new Employee("Canko", 23, 900);
		empsWithSalaries.get("Sales").put(jessy, new LinkedHashMap<>());
		empsWithSalaries.get("Sales").put(canko, new LinkedHashMap<>());
		empsWithSalaries.get("Sales").get(jessy).put("January", 3200.0);
		empsWithSalaries.get("Sales").get(jessy).put("February", 3070.0);
		empsWithSalaries.get("Sales").get(canko).put("January", 2000.0);
		empsWithSalaries.get("Sales").get(canko).put("February", 5000.0);
		empsWithSalaries.get("Sales").get(canko).put("March", 3500.0);
		
		System.out.println("listings:");
		for(Entry<String, HashMap<Employee, LinkedHashMap<String, Double>>> e : empsWithSalaries.entrySet()){
			System.out.println(e.getKey() + ":");
			for(Entry<Employee, LinkedHashMap<String, Double>> e1 : e.getValue().entrySet()){
				System.out.println("    " + e1.getKey());
				for(Entry<String, Double> e2 : e1.getValue().entrySet()){
					System.out.println("        " + e2.getKey() + "  -  " + e2.getValue());
				}
			}
		}
		
		
	}
	
	public void addEmployee(String dep, Employee e){
		if(!emps.containsKey(dep)){
			emps.put(dep, new HashSet<>());
		}
		emps.get(dep).add(e);
	}
	
	public void printEmployees(){
		//for each department - print
//		for (Iterator<Entry<String, HashSet<Employee>>> it = emps.entrySet().iterator(); it.hasNext();) {
//			Entry<String, HashSet<Employee>> e = it.next();
//			String dep = e.getKey();
//			HashSet<Employee> empsInDep = e.getValue();
//			System.out.println("====="+dep+"=====");
//			//for each employee in this department - print 
//			for (Employee employee : empsInDep) {
//				System.out.println(employee);
//			}
//		}
		
		for (Entry<String, HashSet<Employee>> e : emps.entrySet()) {
			System.out.println("====="+e.getKey()+"=====");
			for(Employee emp : e.getValue()){
				System.out.println(emp);
			}
		}
	}
		
	void printEmpsSortedBySalary(){
		printSortedEmployees(new CompBySalary());
	}
	
	void printEmpsSortedByName(){
		printSortedEmployees(new CompByName());
	}
	
	void printEmpsSortedByAge(){
		printSortedEmployees(new CompByAge());
	}
	
	public Collection<Employee> giveMeYourWorkers(String dep, List<Employee> employees){
		//return only the employees from the given list that actually work for the company in the given dep
		//opt 1: TreeSet<Employee> workers = new TreeSet<>(new CompByName());
		//opt 2:
		ArrayList<Employee> workers = new ArrayList<>();
		if(emps.containsKey(dep)){
			HashSet<Employee> empsInMyDep = emps.get(dep);
			HashSet<Employee> clonedEmpsInMyDep = (HashSet<Employee>) empsInMyDep.clone();
			clonedEmpsInMyDep.retainAll(employees);
			workers.addAll(clonedEmpsInMyDep);
		}
		Collections.sort(workers, new CompByName());
		return workers;
	}
	
	private void printSortedEmployees(Comparator<Employee> comp){
		//create treeSet of employees with comparator
		TreeSet<Employee> employees = new TreeSet<>(comp);

		//traverse all employees from all departments
			//add all emps in the new treeset
		for (Entry<String, HashSet<Employee>> e : emps.entrySet()) {
			employees.addAll(e.getValue());
		}
		//print the treeset
		for(Employee empl : employees){
			System.out.println(empl);
		}
	}
	
	public void filterEmployees(){
		//create a hashMap of employee->department with comparator by name and age
		TreeMap<Employee, String> cedka = new TreeMap<>(new CompByNameAge());
		//put all employees from the original collection into the new one
		for (Entry<String, HashSet<Employee>> e : emps.entrySet()) {
			String dep = e.getKey();
			for(Employee emp : e.getValue()){
				if(!cedka.containsKey(emp)){
					cedka.put(emp, dep);
				}
			}
			//clear the original map
			e.getValue().clear();
		}
		//put them back
		for(Entry<Employee, String> cedkaEntry : cedka.entrySet()){
			String dep = cedkaEntry.getValue();
			Employee emp = cedkaEntry.getKey();
			emps.get(dep).add(emp);
		}
	}
	
}
