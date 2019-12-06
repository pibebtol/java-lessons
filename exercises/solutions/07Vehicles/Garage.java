public class Garage {
	public static void main(String[] args) {
		Car car = new Car("BMW", false);
		ElectricCar electricCar = new ElectricCar("Tesla", true, 500);
		Motorcycle motorcycle = new Motorcycle("ZOOZOOKI");
		System.out.println(car);
		System.out.println(electricCar);
		System.out.println(motorcycle);
	}
}
