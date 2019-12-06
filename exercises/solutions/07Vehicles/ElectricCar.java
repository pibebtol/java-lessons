public class ElectricCar extends Car {
	private int capacity;
	
	ElectricCar (String brand, boolean autopilot, int capacity) {
		super(brand, autopilot);
		this.capacity = capacity;
		this.tax = false;
	}
	
	@Override
	public String toString() {
		return super.toString() + " This car drives electric and has a capacity of " + capacity + ".";
	}
}
