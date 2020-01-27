import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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

        System.out.println("-----------------------------");
        for (Player player : players) {
            System.out.print(player + " | ");
        }
        System.out.println();
        

        while (true) {
            // create a scanner so we can read the command-line input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String username = scanner.next();

            // prompt for their age
            System.out.print("Enter your age: ");

            // get the age as an int
            int age = scanner.nextInt();

            System.out.println(String.format("%s, your age is %d", username, age));

        }
    }

    public static void giveCards(List<Player> players, Deck deck, int amount) {
        for (int i = 0; i < amount; i++) {
            for (Player player : players) {
                player.addCards(deck.getCards(1));
            }
        }
    }
}
