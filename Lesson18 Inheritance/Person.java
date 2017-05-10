
public class Person {
	
	private String name;
	private int age;
	private boolean isMale;
	
	Person(String name, int age, boolean isMale){
		if(!name.isEmpty()){
			this.name = name;
		}
		if(age > 0 && age < 130){
			this.age = age;
		}
		this.isMale = isMale;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public boolean isMale() {
		return this.isMale;
	}
	
	void showPersonInfo(){
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println(this.isMale ? "Gender: Male" : "Gender: Female");
	}
	
}
