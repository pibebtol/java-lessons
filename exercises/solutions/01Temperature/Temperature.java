public class Temperature {
	public static void main(String[] args) {
		System.out.println("20°C to F: " + (20 * 9/5 + 32));
		System.out.println("40°C to F: " + (40 * 9/5 + 32));
		System.out.println("120°C to F: " + (120 * 9/5 + 32));
		
		System.out.println("30°C to F (this should be 86): " + (30 * 9/5 + 32));
	}
}