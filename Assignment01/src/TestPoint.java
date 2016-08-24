import java.awt.Point;
import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		ThePoint point1 = new ThePoint();
		ThePoint point2 = new ThePoint();
		
		
		
		System.out.println("Please Enter X coordinate for Point 1");
		point1.setPointX(keyboard.nextInt());
		
		System.out.println("Now Enter the Y Coordinate");
		point1.setPointY(keyboard.nextInt());
		
		System.out.println("Please Enter the X coordinate for Point 2");
		point2.setPointX(keyboard.nextInt());
		
		System.out.println("Now enter the Y Coordinate");
		point2.setPointY(keyboard.nextInt());
		
		System.out.println("Coordinates for Point 1 are ("+ point1.getPointX() +"," + point1.getPointY()+")");
		
		System.out.println("Coordinates for Point 2 are ("+ point2.getPointX() +"," + point2.getPointY()+")");
		
		System.out.println("The Distance between the points is " + Point.distance( point1.getPointX(), point1.getPointY(),
																				point2.getPointX(), point2.getPointY() ));
		
		
		
		
	}

}
