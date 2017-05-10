
public class Task12 {

	public static void main(String[] args) {
		for(int x=102; x<=987; x++){
			int stotici = x/100;
			int desetici = (x/10)%10;
			int edinici = x%10;
			if(stotici!=desetici && desetici!=edinici && stotici!=edinici){
				System.out.println(x);
			}
		}
	}

}
