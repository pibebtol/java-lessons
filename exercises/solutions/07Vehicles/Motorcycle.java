public class Motorcycle extends Vehicle {

	Motorcycle(String brand) {
		super(2, brand);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nThis is a motorcycle.";
	}
}
