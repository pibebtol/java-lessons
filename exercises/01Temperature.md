### Task

Convert 20°C, 40°C and 120°C into Grad Fahrenheit and print the results to the console.

### Hints
- Conversion: [Wikipedia - Grad Fahrenheit](http://de.wikipedia.org/wiki/Grad_Fahrenheit)
- Control value: 30°C = 86°F

### Solution
Similar to the [HelloWorld example](https://pibebtol.github.io/java-lessons/exercises/00HelloWorld), create a new file, named `Temperature.java` and write the calculations into the *System.out.println()* within the *main* function.
```
public class Temperature {
	public static void main(String[] args) {
		System.out.println("20°C to F: " + (20 * 9/5 + 32));
		System.out.println("40°C to F: " + (40 * 9/5 + 32));
		System.out.println("120°C to F: " + (120 * 9/5 + 32));
		
		System.out.println("30°C to F (this should be 86): " + (30 * 9/5 + 32));
	}
}
```

Example solution: [Temperature](https://github.com/pibebtol/java-lessons/tree/master/exercises/solutions/01Temperature)

(This is only an example solution, there is a multitude of possibilities to solve this problem with java, so feel free to try something else!)