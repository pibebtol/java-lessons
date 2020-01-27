## Kartenspiel
### Beschreibung

Das Kartenspiel kann von 4 Spielern gespielt werden.
Ein Spieler hat einen Namen, Punktestand und eine Liste von Karten.

Im Deck gibt es die Karten 1 bis 20 in den Farben Grün, Rot, Blau und Gelb.

Jeder Spieler erhält zu Beginn des Spiels 7 Karten, die vom Deck runtergenommen werden können.

### Aufgaben

1. Erstelle die Klassen `Player`, `Card`, `Deck` und die Hauptklasse `Game` mit der main-Methode.
2. Das Deck enthält ein `LinkedList` in dem alle Karten sind.
3. Der Spieler hat ein `Set` der Karten, die er auf die Hand bekommt.
4. Erzeuge in der main-Methode der Game-Klasse ein Deck mit den Karten und gib jedem Spieler Karten.

### Zusatz

1. Sorge dafür, dass das Deck gemischt werden kann - `shuffleDeck`.
2. Implementiere eine `giveCards` - Methode die allen Spielern abwechselnd die oberste Karte gibt
3. Sorge dafür, dass das Spiel von 1 - 8 Spielern gespielt werden kann.
  * Das Spiel braucht entsprechend auch eine Liste von Spielern mit der immer gleichen Reihenfolge.
