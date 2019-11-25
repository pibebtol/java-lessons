public class Media {

    // You can also make these "protected", but it is better practice to make your attributes private
    // and provide getters and setters (see below the constructor)
    private String title;
    private long isbn;
    private String publisher;

    public Media(String title, long isbn, String publisher) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }
}
