
public class ThePoint {
	
	private int pointX1;
	private int pointY1;
	private int pointX2;
	private int pointY2;
	private int distance;
	
	// No-arg constructor?
	public ThePoint(){
		
		setPointX1(0);
		setPointX2(0);
		setPointY1(0);
		setPointY2(0);
		
		
	}
	
	
	public ThePoint( int pointX1, int pointY1, int pointX2, int pointY2 ) {
		
		super(); /* <----- Don't know what this does... it was automatically generated */
		this.pointX1 = pointX1;
		this.pointY1 = pointY1;
		this.pointX2 = pointX2;
		this.pointY2 = pointY2;
	}


	public int getPointX1() {
		return pointX1;
	}


	public void setPointX1(int pointX1) {
		this.pointX1 = pointX1;
	}


	public int getPointY1() {
		return pointY1;
	}


	public void setPointY1(int pointY1) {
		this.pointY1 = pointY1;
	}


	public int getPointX2() {
		return pointX2;
	}


	public void setPointX2(int pointX2) {
		this.pointX2 = pointX2;
	}


	public int getPointY2() {
		return pointY2;
	}


	public void setPointY2(int pointY2) {
		this.pointY2 = pointY2;
	}
	double getDistance(){
		
		double sum = ( (Math.pow(pointX2 - pointX1 , 2) + (Math.pow(pointY2 - pointY1, 2))) );
		
		double distance = Math.sqrt(sum);
		
		return distance;
	}
	

}
