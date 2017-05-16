package library;

public class TextBook extends ReadingObject implements Comparable<TextBook>{
	
	enum Theme implements IGroup {GEOGRAPHY, HISTORY, BIOLOGY, PROGRAMMING};
	private String author;

	public TextBook(Theme group, String name, String publisher, String author) {
		super(group, ReadingType.TEXTBOOK, name, publisher);
		this.author = author;
	}

	@Override
	public int compareTo(TextBook o) {
		return this.name.compareTo(o.name);
	}

}
