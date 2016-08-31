
public class Car extends Automobile {
	
	int maxPassengers;
	
	public Car(){
		
		
	}

	public Car(int year, double weight, String licensePlate, String make, int maxPassengers) {
		super(year, weight, licensePlate, make);
		this.maxPassengers = maxPassengers;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	@Override
	public String toString() {
		return "Max Passengers: " + maxPassengers + " License Plate: " + licensePlate + " Make: " + make + " Year: "
				+ year + " Weight: " + weight + "";
	}

		
	

}
