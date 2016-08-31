
public class TestVehicle {

	public static void main(String[] args) {

		Car h = new Car();
		
		h.setYear(2006);
		h.setWeight(2100.56);
		h.setLicensePlate("1RT245");
		h.setMake("Honda");
		h.setMaxPassengers(5);
		
		System.out.println("Honda: " + h.toString());
		
		Truck d = new Truck();
		d.setYear(2009);
		d.setWeight(2500.45);
		d.setLicensePlate("2tu123");
		d.setMake("Dodge");
		d.setTowCapacity(1200.0);
		
		System.out.println("Dodge: " + d.toString());
		
		Tank t = new Tank();
		t.setYear(2011);
		t.setWeight(7000.56);
		t.setArmourWidth(4.56);
		
		System.out.println("Tank: " + t.toString());
		
		

	}

}
