// Source: http://www.quickprogrammingtips.com/java/how-to-calculate-area-of-triangle-in-java.html
public class Triangle extends SimpleGeometricObject {
	protected double side1 = 1;
	protected double side2 = 1;
	protected double side3 = 1;

	Triangle() {

	}

	Triangle(double s1, double s2, double s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}

	Triangle(double s1, double s2, double s3, String color, boolean filled) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
		setColor(color);
		setFilled(filled);
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea() {
		double num = (getSide1() + getSide2() + getSide3()) / 2;
		return Math.sqrt(num * (num - getSide1()) * (num - getSide2()) * (num - getSide3()));
	}

	public double getPerimeter() {
		return (getSide1() + getSide2() + getSide3());
	}

	public String toString() {
		return "Triangle side1 = " + getSide1() + " " + " side2 = " + getSide2() + " " + " side3 = " + getSide3() + " "
				+ super.toString();
	}

}
