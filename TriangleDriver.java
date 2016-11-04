import java.util.Scanner;

public class TriangleDriver {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.println("Let's make a triangle:");
		/**Precondition: user enters values that can calculate the area of a triangle*/
		System.out.print("Enter the length of side 1: ");
		double side1 = kb.nextDouble();
		System.out.print("Enter the length of side 2: ");
		double side2 = kb.nextDouble();
		System.out.print("Enter the length of side 3: ");
		double side3 = kb.nextDouble();
		System.out.print("Enter the color of your triangle: ");
		String color = kb.next();
		System.out.print("True or false, your triangle is filled with your above color?: ");
		boolean filled = kb.nextBoolean();
		System.out.println();
		displayObject(new Triangle(side1, side2, side3, color, filled));
		kb.close();
	}

	public static void displayObject(Triangle object) {
		System.out.println("The area of your triangle is: " + object.getArea() + "\nThe perimeter is: "
				+ object.getPerimeter() + "\nSet with the color: " + object.getColor() + "\nFilled status set to: "
				+ object.getFilled());
	}

}
