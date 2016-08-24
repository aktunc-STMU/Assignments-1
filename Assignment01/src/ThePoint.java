
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



	 double getDistance( ThePoint point1, ThePoint point2 ){
		
		double sum = ( Math.pow(point2.pointX + point1.pointX, 2) + Math.pow(point2.pointX + point1.pointX, 2) );
		
		double distance = Math.sqrt(sum);
		
		return distance;

	}
}


