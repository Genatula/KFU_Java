import java.util.Scanner;

public class AreaOfAGraphic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first endpoint: ");
		double xa = scan.nextDouble();

		System.out.println("Enter the second endpoint: ");
		double xb = scan.nextDouble();

		System.out.println("Enter the coefficent of proximity: ");
		int n = scan.nextInt();

		System.out.println("Enter the intended method (rectangle, trapezoid, Simpson's rule): ");
		String method = scan.next();

		double dx = (xb - xa) / (double)n;

		double area = 0.0;

		switch (method) {
			case "rectangle":
				if (dx != 0) {
					for (double x0 = xa; x0 <= xb; x0 += dx) {
						area += calcRectangleArea(dx, calcF(x0));
					}
				}
				break;
			case "trapezoid":
				if (dx != 0) {
					for (double x0 = xa; x0 <= xb; x0 += dx) {
						area += calcTrapezoidArea(dx, calcF(x0), calcF(x0 + dx));
					}
				}
				break;
			case "Simpson's rule":
				if (dx != 0) {
					area = calcSimpsonRule(xa, xb, dx, n);
				}
				break;
			default:
				System.out.println("Unknown command");
		}

		System.out.printf("The area equals to %.3f \n", area);

	}

	public static double calcF(double x) {
		return x * x;
	}

	public static double calcRectangleArea(double length, double width) {
		return length * width;
	}

	public static double calcTrapezoidArea(double height, double firstBase, double secondBase) {
		return (firstBase + secondBase) / 2 * height;
	}

	public static double calcSimpsonRule(double a, double b, double dx, double n) {
		double tempArea = 0.0;
		double tempx0 = a;
		for (int i = 0; i <= n; i++) {
			if (i == 0 || i == n) {
				tempArea += calcF(tempx0);
			} 
			else {
				if (i % 2 == 0) {
					tempArea += 2*calcF(tempx0);
				}
				else {
					tempArea += 4*calcF(tempx0);
				}
			}
			tempx0 += dx;
		}
		tempArea *= dx/3.0;
		return tempArea;
	}
}