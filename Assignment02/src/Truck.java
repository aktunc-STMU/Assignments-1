
public class Truck extends Automobile {

	 double towCapacity;
	
	public Truck(){
		
		
		
	}

	public Truck(int year, double weight, String licensePlate, String make, double towCapacity) {
		super(year, weight, licensePlate, make);
		this.towCapacity = towCapacity;
	}

	public double getTowCapacity() {
		return towCapacity;
	}

	public void setTowCapacity(double towCapacity) {
		this.towCapacity = towCapacity;
	}

	@Override
	public String toString() {
		return "Tow Capacity: " + towCapacity + " License Plate: " + licensePlate + " Make: " + make + " Year: "
				+ year + " Weight: " + weight + "";
	}


	
	
	}
	
	
	
