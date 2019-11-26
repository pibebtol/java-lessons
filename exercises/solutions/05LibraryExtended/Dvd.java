public class Dvd extends Media {

    private int duration;
    private String mainActors;

    public Dvd(String title, long isbn, String publisher, int duration, String mainActors) {
        super(title, isbn, publisher);
        this.duration = duration;
        this.mainActors = mainActors;
    }

    // This overrides the toString() method of the Media class, and uses super() to call the Media toString() method
    @Override
    public String toString() {
        return super.toString() + ". This is also a DVD! " +
                "Duration: " + duration +
                ", Main Actors: " + mainActors;
    }

    public int getDuration() {
        return duration;
    }
}
