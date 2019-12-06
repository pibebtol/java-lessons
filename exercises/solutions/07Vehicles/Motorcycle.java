public class Motorcycle extends Vehicle {

	Motorcycle(String brand) {
		// As we can not directly access wheels, we need to set it through the constructor of the super class by
		// calling super(…). This executes the constructor of the super class.
		super(2, brand);
	}

	// super.toString() calls the toString() method of the super class.
	@Override
	public String toString() {
		return super.toString() + " It is also a motorcycle.";
	}
}
