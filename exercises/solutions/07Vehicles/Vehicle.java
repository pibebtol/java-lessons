// abstract class -> it's not able to create an object of this class
public abstract class Vehicle {

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

	// This function would be accessible from outside of the class. (Not only by the subclasses Car, Motorcycle... but also by Garage)
	// Thus this solution is only partly correct.
	protected void setWheels(int wheels) {
		this.wheels = wheels;
	}

	// Overrides the toString method (which every class inherently has).
	@Override
	public String toString() {
		return "This is a vehicle of the brand " + brand + " with " + wheels + " wheels.";
	}
}
