import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Game {
    public static void main(String[] args) {
        List<Player> players = new LinkedList<>();
        players.add(new Player("Anton"));
        players.add(new Player("Marco"));
        players.add(new Player("Jette"));
        players.add(new Player("Miriam"));
        Deck deck = new Deck();

        deck.shuffleDeck();
        giveCards(players, deck, 2);
        deck.getDiscardPile().addAll(deck.getCards(1));

        Scanner scanner = new Scanner(System.in);
        int currentPlayerPosition = 0;
        Player currentPlayer;

        // Eine Schleife, um einen Zug zu repräsentieren
        // Ein Schleifendurchgang entspricht: Der aktuelle Spieler spielt eine Karte von der Hand,
        // oder zieht eine vom Nachziehstapel.
        // Dann ist der nächste Spieler dran.
        while (true) {

            // Falls die Position des momentanen Spielers größer als die Spieleranzahl ist,
            // setze sie wieder auf 0 (um mit dem ersten Spieler wieder anzufangen)
            if (currentPlayerPosition >= players.size()) {
                currentPlayerPosition = 0;
            }

            currentPlayer = players.get(currentPlayerPosition);
            Card discardPileLastCard = deck.getDiscardPile().get(deck.getDiscardPile().size() - 1);

            System.out.println("Du bist " + currentPlayer.getName() + ".");

            // Iteriert durch alle Spieler in der Liste "players"
            for (Player player : players) {
                System.out.print(player.getName() + ": " + player.getHand().size() + " Karten | ");
            }
            System.out.println();
            System.out.println("Auf dem Ablagestapel liegt: " + discardPileLastCard);

            // Gibt dir deine aktuellen Handkarten aus
            System.out.print("0: Karte ziehen");
            int i = 1;
            for (Card card : currentPlayer.getHand()) {
                System.out.print(" | " + i + ": " + card);
                i++;
            }
            System.out.println();
            System.out.print("Was willst du tun? ");

            // Dies wartet auf eine Eingabe auf der Kommandozeile und speichert sie in "option"
            int option = scanner.nextInt();
            if (option == 0) {
                drawCards(currentPlayer, deck, 1);
            } else {

                // Falls der Spieler Murks eingegeben hat …
                if (option > currentPlayer.getHand().size() || option < 0) {
                    System.out.println("Invalide Eingabe! Strafkarte ziehen!");

                    drawCards(currentPlayer, deck, 1);
                }
                else {
                    Card cardToPlay = currentPlayer.getHand().get(option - 1);

                    // Prüfe, ob die ausgewählte Karte die richtige Farbe oder die richtige Zahl hat
                    if (cardToPlay.getColor().equals(discardPileLastCard.getColor()) ||
                            cardToPlay.getNumber() == discardPileLastCard.getNumber()) {

                        currentPlayer.getHand().remove(option - 1);
                        System.out.println("Du spielst die Karte " + cardToPlay);
                        deck.getDiscardPile().add(cardToPlay);
                    }

                    // Ansonsten muss der Spieler eine Strafkarte ziehen
                    else {
                        System.out.println("Du hast versucht, eine " + cardToPlay + " auf eine " + discardPileLastCard +
                                " zu legen! Strafkarte ziehen!");

                        drawCards(currentPlayer, deck, 1);
                    }
                }
            }

            System.out.println();
            System.out.println("-----------------------");
            System.out.println();

            // Falls der momentane Spieler keine Handkarten mehr hat, hat er gewonnen
            // "break" bringt einen aus der aktuellen Schleife heraus
            if (currentPlayer.getHand().size() == 0) {
                break;
            }

            //TODO: Prüfe, ob der Nachziehstapel leer ist. Falls ja, muss der Ablagestapel in den Nachziehstapel gemischt werden.

            // Fertig mit dem Zug. Die Position den aktuellen Spielers wird um eins hochgesetzt, damit der nächste dran
            // ist.
            currentPlayerPosition++;
        }

        // Dies wird aufgerufen, wenn die Schleife durch ein "break" beendet wurde
        System.out.println("Das Spiel ist vorbei!");
    }

    public static void giveCards(List<Player> players, Deck deck, int amount) {
        for (int i = 0; i < amount; i++) {
            for (Player player : players) {
                player.addCards(deck.getCards(1));
            }
        }
    }

    private static void drawCards(Player player, Deck deck, int amount) {
        // Hole Karten vom Nachziehstapel
        Set<Card> newCards = deck.getCards(amount);

        // Gehe durch alle neuen Karten hindurch (in unserem Fall nur eine), und füge sie der Hand hinzu
        for (Card card : newCards) {
            System.out.println("Du hast eine " + card + " gezogen.");
        }
        player.addCards(newCards);
    }
}
