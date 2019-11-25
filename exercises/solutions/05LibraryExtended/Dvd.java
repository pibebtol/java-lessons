public class Dvd extends Media {

    // You can also make these "protected", but it is better practice to make your attributes private
    // and provide getters and setters (see below the constructor)
    private int duration;
    private String mainActors;

    public Dvd(String title, long isbn, String publisher, int duration, String mainActors) {
        super(title, isbn, publisher);
        this.duration = duration;
        this.mainActors = mainActors;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getMainActors() {
        return mainActors;
    }

    public void setMainActors(String mainActors) {
        this.mainActors = mainActors;
    }
}
