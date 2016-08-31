
public class Tank extends Vehicle {
	
	double armourWidth;
	
	public Tank(){
	
	}

	
	public Tank(int year, double weight, double armourWidth) {
		super(year, weight);
		this.armourWidth = armourWidth;
	}


	public double getArmourWidth() {
		return armourWidth;
	}


	public void setArmourWidth(double armourWidth) {
		this.armourWidth = armourWidth;
	}


	@Override
	public String toString() {
		return "Armour Width: " + armourWidth + " Year: " + year + " Weight: " + weight + "";
	}





	}


