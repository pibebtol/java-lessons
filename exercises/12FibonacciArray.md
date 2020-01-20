### Beschreibung

Die Menge `FibonacciArray` kann genau solche Zahlen enthalten die auch in der *Fibonacci-Folge* vorkommen. Wenn andere Zahlen hinzugefügt werden soll eine unchecked `NoFibonacciException` geworfen werden.

### Aufgaben

1. Erstelle eine Klasse `FibonacciArray`.
2. Erstelle eine neue Klasse `NoFibonacciException extends Exception`.
3. Implementiere `void add(int i)` so, dass nur Zahlen der Fibonacci-Folge hinzugefügt werden können und bei Bedarf eine `NoFibonacciException` geworfen wird.
4. Teste deine Implemtierung mit der unten gegebenen Testklasse.

### Hinweise

 - Als erstes könnt ihr zum test nur dieses Array zum abgleichen nutzen:
   - `private int[] fibonaccis = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};`
 - [Fibonacci-Folge](https://de.wikipedia.org/wiki/Fibonacci-Folge)

```java
public class Test {
	public static void main(String[] args) {
		
		FibonacciArray fiboMenge = new FibonacciArray();
		for (int i = 0; i < 100; i++) { 
			try {
				fiboMenge.add(i);
				System.out.println(i);
			} catch (NoFibonacciException e) {
			} 
		}
	} 
}
```