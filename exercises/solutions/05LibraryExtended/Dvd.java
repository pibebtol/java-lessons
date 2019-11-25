public class Dvd extends Media {

    private int duration;
    private String mainActors;

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

    public Dvd(String title, long isbn, String publisher, int duration, String mainActors) {
        super(title, isbn, publisher);
        this.duration = duration;
        this.mainActors = mainActors;
    }
}
