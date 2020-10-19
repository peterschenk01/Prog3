package shelf;

public class Book extends ShelfItem{
	
	private final String title;
	private final String author;
	private final int pages;
	
	public Book(String title, String author, int pages) {
		if(title == null || author == null || pages == 0 || title.equals("") || author.equals(""))
			throw new IllegalArgumentException();
		
		this.title = title;
		this.author = author;
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPages() {
		return pages;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pages=" + pages + "]";
	}
	
}
