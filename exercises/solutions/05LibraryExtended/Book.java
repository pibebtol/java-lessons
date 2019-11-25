public class Book extends Media {

    private String author;
    private int pages;


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

    public Book(String title, long isbn, String publisher, String author, int pages) {
        super(title, isbn, publisher);
        this.author = author;
        this.pages = pages;
    }
}

