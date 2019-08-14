package AssignmentSession3;

import java.util.Scanner;

public class TestLine {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Line l = new Line();
		Line l2 = new Line();
		
		System.out.println("Enter your value for x1: ");
		l.setX(input.nextInt());
		System.out.println("Enter your value for y1: ");
		l.setY(input.nextInt());

		System.out.println("Enter your value for x2: ");
		l2.setX(input.nextInt());
		System.out.println("Enter your value for y2: ");
		l2.setY(input.nextInt());
		
		System.out.println("Your line would be from the coordinates of (" + l.getX() + "," + l.getY() + ") to (" + l2.getX() + "," + l2.getY() + ")");

		
		
	}

}
