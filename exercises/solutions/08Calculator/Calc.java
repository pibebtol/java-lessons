import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a first (int) digit: ");
		    int firstDigit = scanner.nextInt();
		    System.out.print("Enter a second (int) digit: ");
		    int secondDigit = scanner.nextInt();
		    System.out.print("Enter the operand: ");
		    String operand = scanner.next();
		    calculate(firstDigit, secondDigit, operand);
		}
	}

	public static void calculate(int firstDigit, int secondDigit, String operand) {
		if ("+".equals(operand)) {
			System.out.println("Result: " + (firstDigit + secondDigit));
		}
		if ("-".equals(operand)) {
			System.out.println("Result: " + (firstDigit - secondDigit));
		}
		if ("*".equals(operand)) {
			System.out.println("Result: " + (firstDigit * secondDigit));
		}
		if ("/".equals(operand)) {
			if (secondDigit == 0) {
				System.out.println("No!");
			} else {
				System.out.println("Result: " + (firstDigit / secondDigit));
			}
		}
	}
}
