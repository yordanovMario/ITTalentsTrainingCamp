package library;

import java.time.LocalDate;

import library.Book.Genre;
import library.Magazine.Category;
import library.ReadingObject.ReadingType;
import library.TextBook.Theme;

public class Demo {

	public static void main(String[] args) {
		
		
		Book book = new Book("Voina i mir", "Siela", Genre.DRAMA, "Tolstoi", LocalDate.now());
		Book book2 = new Book("Pod Igoto", "Prosveta", Genre.DRAMA, "Ivan Vazov", LocalDate.of(2000, 12, 15));
		Magazine spisanie = new Magazine(Category.GOSSIP, "Chuk chuk", "Chuk Ltd", 1, LocalDate.now());
		Magazine spisanie2 = new Magazine(Category.NATURE, "Nat Geo", "nat geo BG", 2, LocalDate.now());
		TextBook javaForEveryone = new TextBook(Theme.PROGRAMMING, "Java za vseki", "Krasi corporation", "Krasimir Stoev i Nikolai Tomitov");
		TextBook history = new TextBook(Theme.HISTORY, "History 12 klas", "Prosveta", "Ivan Ivanov");
		
		Library lib = new Library();
		
		lib.addReadingObject(book2);
		lib.addReadingObject(book);
		lib.addReadingObject(spisanie);
		lib.addReadingObject(spisanie2);
		lib.addReadingObject(javaForEveryone);
		lib.addReadingObject(history);
		
		System.out.println(lib);
		System.out.println(lib.katalog.get(ReadingType.BOOK).size());
		System.out.println(lib.katalog.get(ReadingType.MAGAZINE).size());
		
	}
}
