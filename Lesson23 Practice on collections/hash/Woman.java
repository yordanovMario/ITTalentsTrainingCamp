package hash;

public class Woman {

	private String name;
	int age;


	public Woman(String name) {
		this.name = name;
	}

	public Woman(String name, int age) {
		this(name);
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
