import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

class Player {

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    private List<Card> hand = new ArrayList<>();
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
        return name + " " + points + " " + hand.toString();
    }
}
