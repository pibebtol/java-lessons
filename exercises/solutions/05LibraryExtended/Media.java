public class Media {

    protected String title;
    protected long isbn;
    protected String publisher;

    public Media(String title, long isbn, String publisher) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    // This overrides the toString() method, which is implicitly available in every class
    @Override
    public String toString() {
        return "This is a Media item. Title: " + title  +
                ", Isbn: " + isbn +
                ", Publisher: " + publisher;
    }

    public String getTitle() {
        return title;
    }

}
