
public class Vehicle {
	
	int year;
	double weight;
	
	
	public Vehicle(){
		
		
		
	}
	
	
	public Vehicle(int year, double weight) {
		super();
		this.year = year;
		this.weight = weight;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Year: " + year + "Weight: " + weight + "";
	}
	
	

	
}
