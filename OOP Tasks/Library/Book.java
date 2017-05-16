package library;

import java.time.LocalDate;

public class Book extends ReadingObject implements Comparable<Book>{
	
	enum Genre implements IGroup {SCIFI, DRAMA, ROMANCE, ACTION};
	private String author;
	private LocalDate issueDate;

	public Book(String name, String publisher, Genre group, String author, LocalDate issueDate) {
		super(group, ReadingType.BOOK, name, publisher);
		this.author = author;
		this.issueDate = issueDate;
	}

	@Override
	public int compareTo(Book o) {
		return this.issueDate.compareTo(o.issueDate);
	}
	
	
	
}
