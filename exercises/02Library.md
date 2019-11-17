## Library

### Description
In a small library you can lend books for reading.
Every book has a title and a ISBN number.
The library can have the same book multiple times.
In the library is space for up to ten books.

### Task
1. Model the classes `Library` and `Book`.
2. Build a constructor for the class `Book` that accepts a title and a ISBN number.
3. Build functions in the class `Book` that return the title and ISBN number.
4. Implement a `main` method in the class `Library`, that creates multiple books and tests the functions of the class `Book`.

### Hints
* A ISBN has 13 digits. Use either *long* (as *int* is to short) or *String*.
* For the assignment of *long* values a `L` is attached to the value:
```
long var = 1234501234567890L
```
* Check the [slides (15 and following)](https://pibebtol.github.io/java-lessons/lessons/02ObjectOrientedProgramming.pdf)

### Solution
Similar to the slides (there with a class Student), we have to create a class *Book* in a file `Book.java`. That class needs the attributes title and isbn and get-methods (*getters*) to access these attributes from outside of the class.
```
public class Book {

	private String title;
	private long isbn;

	public String getTitle() {
		return title;
	}

	public long getIsbn() {
		return isbn;
	}
}
```
We set these attributes when we create the book in the constructor:
```
	Book(String title, long isbn) {
		this.title = title;
		this.isbn = isbn;
	}
```
Then we need a class *Library*, that can store 10 books:
```
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
            // here the functions of Book are tested
			System.out.println(books[i].getTitle() + " - " + books[i].getIsbn());
		}
	}
}
```
The count is there, to keep track of how many books were added to the library and to know at what index the next book has to be added.

Now we only need to create a library, add some books to the library and test the output:
```
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
```
Example solution: [Library](https://github.com/pibebtol/java-lessons/tree/master/exercises/solutions/02Library)