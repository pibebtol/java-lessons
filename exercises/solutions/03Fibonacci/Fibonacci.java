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
