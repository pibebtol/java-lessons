public class Library {
    public static void main(String[] args) {
        Media[] shelf = new Media[20];
        shelf[0] = new Book("Das Café am Rande der Welt", 12345678901234L, "dtv",
                "John Strelecky", 128);

        shelf[1] = new Dvd("Your Name.", 12345678901235L, "Universum Film GmbH",
                107, "Makoto Shinkai, Noritaka Kawaguchi");

        for (Media media : shelf) {
            if (media == null) continue;
            if (media instanceof Book) {
                Book thisBook = (Book) media;
                System.out.println("This is the book " + thisBook.getTitle() + " from " + thisBook.getAuthor());
            }
            if (media instanceof Dvd) {
                Dvd thisDvd = (Dvd) media;
                System.out.println("This is the DVD " + thisDvd.getTitle() + " with play time " + thisDvd.getDuration());
            }
        }
    }
}
