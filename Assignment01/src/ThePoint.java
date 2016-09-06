
public class ThePoint {
	
	private int pointX;
	private int pointY;

	
	// No-arg constructor?
	public ThePoint(){
		
		setPointX(0);
		setPointY(0);

	}
	
	
	public ThePoint( int pointX, int pointY ) {
		
		super(); 
		this.pointX = pointX;
		this.pointY = pointY;
	
	}


	public int getPointX() {
		return pointX;
	}


	public void setPointX(int pointX) {
		this.pointX = pointX;
	}


	public int getPointY() {
		return pointY;
	}


	public void setPointY(int pointY) {
		this.pointY = pointY;
		
	}



	 public static double getDistance( ThePoint point1, ThePoint point2 ){
		
		double sum = ( Math.pow(point2.pointX + point1.pointX, 2) + Math.pow(point2.pointX + point1.pointX, 2) );
		
		double distance = Math.sqrt(sum);
		
		return distance;

	}
	
	/*
	It would be better to write the distance using public double distance(p2) {  
	
	you can use p1.distance(p2); This may be the most object-oriented way to write this program as no static methods are used.
	*/
}


