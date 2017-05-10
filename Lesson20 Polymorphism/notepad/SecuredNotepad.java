package notepad;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad{
	
	private String password;
	
	public SecuredNotepad(int maxPages, String password) {
		super(maxPages);
		String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{5,}";
		if(password.matches(pattern)){
			this.password = password;
		}
	}
	
	private boolean validatePassword(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Password: ");
		String input = sc.next();
		if(this.password.equals(input)){
			return true;
		}
		System.out.println("Incorrect password!");
		return false;
	}

	@Override
	public void addText(String text, int pageNumber) {
		if(validatePassword()){
			super.addText(text, pageNumber);
		}
	}

	@Override
	public void overWriteText(String text, int pageNumber) {
		if(validatePassword()){
			super.overWriteText(text, pageNumber);
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if(validatePassword()){
			super.deleteText(pageNumber);
		}
	}

	@Override
	public void viewAllPages() {
		if(validatePassword()){
			super.viewAllPages();
		}
	}
	
	@Override
	void addPage(Page page) {
		if(validatePassword()){
			super.addPage(page);
		}
	}

	

}
