package shelf;

import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {

	@Test
	public void testBook_Constructor() {
		var book = new Book("Titel", "Autor", 69);
		
		assertEquals(book.getTitle(), "Titel");
		assertEquals(book.getAuthor(), "Autor");
		assertEquals(book.getPages(), 69);
	}
	
	@Test
	public void testBook_toString() {
		var book = new Book("Titel", "Autor", 69);
		
		assertEquals(book.toString(), "Book [title=" + "Titel" + ", author=" + "Autor" + ", pages=" + 69 + "]");
	}
}
