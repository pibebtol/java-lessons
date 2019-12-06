public class Vehicle {

	// Every vehicle has wheels, a tax value and a brand.
	// Therefore we store it here
	private int wheels;
	protected boolean tax = true;
	protected String brand;

	// The constructor for a vehicle.
	// Stores the wheel count, and the brand
	Vehicle(int wheels, String brand) {
		this.wheels = wheels;
		this.brand = brand;
	}

	// Overrides the toString method (which every class inherently has).
	@Override
	public String toString() {
		return "This is a vehicle of the brand " + brand + " with " + wheels + " wheels.";
	}
}
