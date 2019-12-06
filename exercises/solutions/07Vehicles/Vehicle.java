public class Vehicle {
	private int wheels;
	protected boolean tax = true;
	protected String brand;
	
	Vehicle(int wheels, String brand) {
		this.wheels = wheels;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "This is a vehicle of the brand " + brand + " with " + wheels + " wheels.";
	}
}
