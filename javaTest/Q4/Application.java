package q4;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fuelType;
		ArrayList<Car> Cars = new ArrayList<Car>();

		Car car1 = new Car("Camry", "Toyota", false);
		Car car2 = new Car("Mustang", "Ford", true);
		Car car3 = new Car("Wrangeler", "Jeep", false);
		Cars.add(car1);
		Cars.add(car2);
		Cars.add(car3);
		for (Car c : Cars) {
			System.out.println("the model is " + c.model + " the make is " + c.make);
			fuelType = c.GetFuelType();
			System.out.println("Fuel type is " + fuelType);
		}
	}
}
