
public class Automobile extends Vehicle {

	String licensePlate;
	String make;
	
	public Automobile(){
	
		
	}
	
	public Automobile(int year, double weight, String licensePlate, String make) {
		super(year, weight);
		this.licensePlate = licensePlate;
		this.make = make;
	}


	public String getLicensePlate() {
		return licensePlate;
	}


	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "LicensePlate: " + licensePlate + " Make: " + make + "Year: " + year + "Weight: " + weight
				+ "";
	}


	
	}
	
