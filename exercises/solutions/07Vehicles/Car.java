public class Car extends Vehicle {
	protected boolean autopilot;
	
	Car(String brand, boolean autopilot) {
		super(4, brand);
		this.autopilot = autopilot;
	}
	
	@Override
	public String toString() {
		return super.toString() + " This is a car.";
	}
}
