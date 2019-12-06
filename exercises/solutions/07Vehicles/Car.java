// The class for the car. Extends the class Vehicle, and therefore also holds wheels, tax, and brand.
// We can not directly access wheels, as it is private in Vehicle.
public class Car extends Vehicle {
	protected boolean autopilot;

	// The constructor for cars.
	Car(String brand, boolean autopilot) {
		// As we can not directly access wheels, we need to set it through the constructor of the super class by
		// calling super(…). This executes the constructor of the super class.
		super(4, brand);
		this.autopilot = autopilot;
	}

	// super.toString() calls the toString() method of the super class.
	@Override
	public String toString() {
		return super.toString() + " Is is also a car.";
	}
}
