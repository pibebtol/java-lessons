public class Library {
    public static void main(String[] args) {

        Media[] shelf = new Media[20];

        shelf[0] = new Book("Das Café am Rande der Welt", 12345678901234L, "dtv",
                "John Strelecky", 128);

        shelf[1] = new Dvd("Your Name.", 12345678901235L, "Universum Film GmbH",
                107, "Makoto Shinkai, Noritaka Kawaguchi");

        // iterates through all items in shelf
        // is the same as:
        //
        // for (int i = 0; i < 20; i++)
        // media = shelf[i]

        for (Media media : shelf) {

            // If there is nothing in the shelf, go to the next iteration of the loop
            // The key word "continue" aborts the current loop and begins the next one
            if (media == null) continue;

            // If our media is a book, print the title and author
            if (media instanceof Book) {
                Book thisBook = (Book) media;
                System.out.println("This is the book " + thisBook.getTitle() + " from " + thisBook.getAuthor());
            }

            // If our media is a DVD, print the title and the duration
            if (media instanceof Dvd) {
                Dvd thisDvd = (Dvd) media;
                System.out.println("This is the DVD " + thisDvd.getTitle() + " with play time " + thisDvd.getDuration());
            }
        }

        // Alternatively:
        for (Media media : shelf) { // For each media in the shelf do:

            // If there is nothing in the shelf, go to the next iteration of the loop
            // The key word "continue" aborts the current loop and begins the next one
            if (media == null) continue;

            // As the toString() method is also overridden by our classes, we can just call this:
            System.out.println(media);
        }
    }
}
