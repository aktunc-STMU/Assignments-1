import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		ThePoint point1 = new ThePoint();
		ThePoint point2 = new ThePoint();
		
		
		
		
		
		
		System.out.println("Please Enter X coordinate for Point 1");
		point1.setPointX1(keyboard.nextInt());
		
		System.out.println("Now Enter the Y Coordinate");
		point1.setPointY1(keyboard.nextInt());
		
		System.out.println("Please Enter the X coordinate for Point 2");
		point2.setPointX2(keyboard.nextInt());
		
		System.out.println("Now enter the Y Coordinate");
		point2.setPointY2(keyboard.nextInt());
		
		System.out.println("Coordinates for Point 1 are ("+ point1.getPointX1() +"," + point1.getPointY1()+")");
		
		System.out.println("Coordinates for Point 2 are ("+ point2.getPointX2() +"," + point2.getPointY2()+")");
		
		System.out.println("The Distance between the points is ");
		
		
		
		
	}

}
