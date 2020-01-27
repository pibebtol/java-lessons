import java.util.LinkedList;
import java.util.List;

class Game {
    public static void main(String[] args) {
        List<Player> players = new LinkedList<>();
        players.add(new Player("Anton"));
        players.add(new Player("Marco"));
        players.add(new Player("Jette"));
        players.add(new Player("Miriam"));
        Deck deck = new Deck();
        deck.shuffleDeck();
        giveCards(players, deck, 7);
        for (Player player : players) {
            System.out.println(player);
        }
        System.out.println(deck);
    }

    public static void giveCards(List<Player> players, Deck deck, int amount) {
        for (int i = 0; i < amount; i++) {
            for (Player player : players) {
                player.addCards(deck.getCards(1));
            }
        }
    }
}
