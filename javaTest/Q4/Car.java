package q4;

public class Car {
	String model;
	String make;
	boolean electric;
	String fuel;
	
	Car(String model,String make, boolean elctric){
		this.model = model;
		this.make = make;
		this.electric = true;
	}

	public String GetFuelType() {
		if (this.electric) {
			fuel = ("electric");
		}
		else {
			fuel = ("gas");
		}
		return fuel;
		
	}
}
