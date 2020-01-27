# Kartenspiel Revisited

*Diese Aufgabe ist die Folgeaufgabe zu der [Kartenspielaufgabe](https://pibebtol.github.io/java-lessons/exercises/13Kartenspiel) von letzter Session.*

*Ihr könnt entweder eure eigene Lösung weiterverwenden, oder euch an [unserer Lösung](https://github.com/pibebtol/java-lessons/tree/master/exercises/solutions/12Kartenspiel) orientieren.*

### Beschreibung
Wir wollen nun das Spiel **Uno** bauen. Die Spielregeln findet ihr [hier](https://www.uno-kartenspiel.de/spielregeln/).

Neben Spieler, Karten und einen Nachziehstapel brauchen wir dafür noch einen Ablagestapel.
Auf diesen legen die Spieler offen ihre Karten drauf. Die oberste Karte bestimmt, welche Karte vom nächsten Spieler gelegt werden kann.

Auf eine Karte können alle Karten mit der gleichen Farbe oder gleichen Nummer gelegt werden.
> Auf eine Karte *Rot 4* gehen alle roten Karten (*Rot 5*, *Rot 18*, …) und alle Vieren (*Grün 4*, *Blau 4*, *Gelb 4*).

Die Spieler legen der Reihe nach ihre Karten auf den Stapel. Wer keine Karte legen kann, muss eine Karte vom Nachziehstapel ziehen.
> Ist der Nachziehstapel alle, müssen die Karten des Ablagestapels gemischt werden (außer die Oberste).

Sonderkarten können den Spielfluss verändern.

### Aufgaben
1. Sorge dafür, dass man das Spiel spielen kann.
1. Fertig :smile:

(Spaß beiseite):
1. Implementiere den Ablagestapel (siehe `Deck.java` -> `discardPile`).
1. Baue eine Oberfläche, damit ein Spieler eine Karte ablegen kann (siehe [Tipp 1](#tipp-1)).
    - Natürlich solltest du beachten, dass man nur **passende** Karten ablegen darf (siehe Spielregeln oben).
3. Entsprechend der Reihenfolge ist dann der Nächste Spieler dran, eine Karte zu legen.
4. Das Spiel geht so lange, bis einer keine Karten mehr hat. Den Ruf "Uno!" bei der letzten Karte ignorieren wir erstmal.
5. Neu mischen des *Na*ch*zi*ehstapels [[1]](#homage-an-mark-uwe-kling) aus den Karten des Ablagestapels.

### Zusatz
- Sorge dafür, dass Spieler entweder von Menschenhand oder von einem Bot bedient werden.
- Baue eine Extrafunktion für die Benutzeroberfläche, um "Uno!" zu rufen. Wenn man diesen falsch verwendet (oder bei der letzten Karte vergisst) muss man eine Strafkarte ziehen.
- Implementiere Uno-typische Sonderkarten mit Extraregeln (siehe [Tipp 2](#tipp-2))

### Tipp 1
* Für Nutzereingaben nochmal [hier](http://alvinalexander.com/java/edu/pj/pj010005) nachlesen.
* Erstellt eine Bedienoberfläche für die Kommandozeile:
(Ihr könnt euch an folgendem Beispiel orientieren)
```
Spieler 1: 3 Karten | Spieler 2: 5 Karten 
Oberste Karte des Ablagestapels: Grün 5
0: Karte nachziehen | 1: Rot 3 | 2: Blau 14 | 3: Grün 1

Welche Karte willst du legen?
```

### Tipp 2
Zum Beispiel:
* Aussetzer in Farbe
* Spielerreihenfolge umkehren in Farbe
* +2 in Farbe
* Wünscher ohne Farbe
* +4 und Wünscher ohne Farbe

###### [*Homage an Marc-Uwe Kling*](http://www.halt-mal-kurz.de/).
