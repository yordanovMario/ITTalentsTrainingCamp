package postOffice;

public class Citizen {
	
	private String firstName; 
	private String lastName;
	private String address;
	
	public Citizen(String firstName, String lastName, String address) {
		if(!firstName.isEmpty()){
			this.firstName = firstName;
		}
		if(!firstName.isEmpty()){
			this.lastName = lastName;
		}
		if(!address.isEmpty()){
			this.address = address;
		}
	}
	
	
	
}
