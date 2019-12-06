public class FibonacciArray {

	private int[] fibonaccis = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89}; 
	
	public boolean add(int e) throws NoFibonacciException {
		if (isFibonacci(e)) {
			return true;
		} else {
			throw new NoFibonacciException();	
		}
	}
	
	private boolean isFibonacci(int i) {
		int fib1 = 1, fib2 = 1;
		while (true) {
			fib1 = fib1 + fib2;
			if (fib2 == i) {
				return true;
			}
			fib2 = fib1 + fib2;
			if (fib1 == i) {
				return true;
			}
			if (fib1 > i | fib2 > i) {
				return false;
			}
		}
	}
}
