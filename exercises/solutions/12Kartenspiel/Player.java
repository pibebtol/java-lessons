import java.util.Set;
import java.util.HashSet;

class Player {

    private Set<Card> hand = new HashSet<>();
    private String name;
    private int points;

    Player(String name) {
        this.name = name;
    }

    public void addCards(Set<Card> cards) {
        hand.addAll(cards);
    }

    public void addPoints(int points) {
        this.points += points;
    }
    
    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + points + "): " + hand.size();
    }
}
