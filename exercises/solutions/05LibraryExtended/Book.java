public class Book extends Media {

    private String author;
    private int pages;

    public Book(String title, long isbn, String publisher, String author, int pages) {
        super(title, isbn, publisher);
        this.author = author;
        this.pages = pages;
    }

    // This overrides the toString() method of the Media class, and uses super() to call the Media toString() method
    @Override
    public String toString() {
        return super.toString() + ". This is also a Book! " +
                "Author: " + author +
                ", Pages: " + pages;
    }

    public String getAuthor() {
        return author;
    }
}
