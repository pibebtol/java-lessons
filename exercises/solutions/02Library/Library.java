public class Library {

	private Book[] books = new Book[10];
	private int count = 0;

	// checks if there is still some space in the library, if so it adds the book
	public void addBookToLibrary(Book book) {
		if(count < 10) {
			this.books[count] = book;
			count++;
		} else {
			System.out.println("Cannot add another book, the library is full.");
		}
	}

	// prints the books to the console
	public void printBooks() {
		System.out.println("There are the following books(" + count + ") in the library:");
		for(int i = 0; i < count; i++) {
			System.out.println(books[i].getTitle() + " - " + books[i].getIsbn());
		}
	}

	public static void main(String[] args) {
		Library library = new Library();
		createExampleBooks(library);
		library.printBooks();
	}

	public static void createExampleBooks(Library library) {
		library.addBookToLibrary(new Book("Faust", 1234567890100L));
		library.addBookToLibrary(new Book("Faust 2", 1234567890101L));
		library.addBookToLibrary(new Book("Harry Potter", 1234567890102L));
		library.addBookToLibrary(new Book("Good Omens", 1234567890103L));
		library.addBookToLibrary(new Book("Lord of the Rings", 1234567890104L));
		library.addBookToLibrary(new Book("Raising Steam", 1234567890105L));
		library.addBookToLibrary(new Book("Softwaredevelopment", 1234567890106L));
		library.addBookToLibrary(new Book("Effie Briest", 1234567890107L));
		library.addBookToLibrary(new Book("Eragon", 1234567890108L));
		library.addBookToLibrary(new Book("Beer and other beverages", 1234567890109L));
		library.addBookToLibrary(new Book("Harry Potter 2", 1234567890110L));
	}
}
