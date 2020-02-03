import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

class Deck {

    private List<Card> drawPile = new LinkedList<>();
    private List<Card> discardPile = new LinkedList<>();

    Deck() {
        List<String> colours = new LinkedList<>();
        colours.add("Grün");
        colours.add("Rot");
        colours.add("Blau");
        colours.add("Gelb");
        for (String color : colours) {
            for (int i = 1; i <= 20; i++) {
                drawPile.add(new Card(color, i));
            }
        }
    }

    public Set<Card> getCards(int amount) {
        Set<Card> cards = new HashSet<>();
        for (int i = 0; i < amount; i++) {
            cards.add(drawPile.remove(0));
        }
        return cards;
    }

    void shuffleDeck() {
        Random random = new Random();
        int size = drawPile.size();
        for (Card card : drawPile) {
            int goalIndex = random.nextInt(size);
            int sourceIndex = drawPile.indexOf(card);
            drawPile.set(sourceIndex, drawPile.get(goalIndex));
            drawPile.set(goalIndex, card);
        }
    }

    public List<Card> getDiscardPile() {
        return discardPile;
    }

    public void setDiscardPile(List<Card> discardPile) {
        this.discardPile = discardPile;
    }

    @Override
    public String toString() {
        return drawPile.toString();
    }
}
