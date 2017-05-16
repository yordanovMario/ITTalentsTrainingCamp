package postOffice;

public class PostMan extends Thread{
	
	private String firstName;
	private String lastName;
	private int yearsExp;
	private PostOffice postOffice;
	
	public PostMan(String firstName, String lastName, int yearsExp, PostOffice postOffice) {
		if(!firstName.isEmpty()){
			this.firstName = firstName;
		}
		if(!firstName.isEmpty()){
			this.lastName = lastName;
		}
		if(yearsExp>=0){
			this.yearsExp = yearsExp;
		}
		if(postOffice != null){
			this.postOffice = postOffice;
		}
	}
	
	public PostOffice getPostOffice() {
		return postOffice;
	}
	
	@Override
	public void run() {
		while(true){
			this.postOffice.deliverMail();
			
		}
	}
}
