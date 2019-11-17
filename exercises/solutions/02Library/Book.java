public class Book {

	private String title;
	private long isbn;

	Book(String title, long isbn) {
		this.title = title;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public long getIsbn() {
		return isbn;
	}
}
