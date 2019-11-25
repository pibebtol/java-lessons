public class Book extends Media {

    // You can also make these "protected", but it is better practice to make your attributes private
    // and provide getters and setters (see below the constructor)
    private String author;
    private int pages;

    public Book(String title, long isbn, String publisher, String author, int pages) {
        super(title, isbn, publisher);
        this.author = author;
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}
