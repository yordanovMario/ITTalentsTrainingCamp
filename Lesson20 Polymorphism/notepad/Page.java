package notepad;

import org.omg.Messaging.SyncScopeHelper;

public class Page implements IPage{
	
	private String title;
	private String text;
	
	public Page(String title, String text){
		if(title.length() <= 50){
			this.title = title;
		}
		else{
			System.out.println("Ïnvalid title.");
		}
		this.text = text;
	}
	
	@Override
	public void addText(String text) {
		this.text = this.text.concat(" " + text);
	}
	
	@Override
	public void deleteText() {
		this.text = "";
	}
	
	@Override
	public String viewPage() {
		System.out.println(this.title);
		System.out.println(this.text);
		return this.text;
	}
	
	boolean searchWord(String word){
		System.out.print("Contains given word: ");
		return this.text.contains(word);
	}
	
	boolean containsDigits(){
		System.out.print("Contains digits: ");
		return this.text.matches(".*[0-9].*");
	}
	
}
