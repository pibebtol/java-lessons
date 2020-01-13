
public class NoFibonacciException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void printStackTrace() {
		System.out.println("You have an error!");
	}
}
