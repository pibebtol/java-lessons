## Fibonacci

### Description
The fincinobi numbers form a sequence where each number is the sum of the two preceeding numbers. The first two elements are defined to be 0.

### Task
1. Write a program that calculates any element of the fibonacci sequence.
2. Test the program with the first 15 elements.

### Hints
* The first 15 elements of the sequence: 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
* [Wikipedia - Fibonacci Sequence](https://en.wikipedia.org/wiki/Fibonacci_number)

### Solution
The fibonacci-sequence can be implemented via [recursion](https://en.wikipedia.org/wiki/Recursion). That means that instead of calling the functions from the outside, it calls itself to determine the previous elements of the sequence.
```
public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("1 1 2 3 5 8 13 21 34 55 89 144 233 377 610");
		for (int i = 0; i < 15; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	 // Returns the fibonacci number at given index.
	public static int fibonacci(int index) {
		if(index == 0 | index == 1) {
			return 1;
		} else {
			return fibonacci(index - 2) + fibonacci(index - 1);
		}
	}
}
```