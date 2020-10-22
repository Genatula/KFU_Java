public class CubicFunction {

	public static void main(String[] args) {
		double x = 2.0;
		double y = 8.0000000001;
		if (Math.abs(y - calcCubicFunc(x)) < 1e-10) {
			System.out.println("The point belongs to the function");
		}
		else {
			System.out.println("The point does not belong to the function");
		}

		System.out.println((y - calcCubicFunc(x)) == 0.0);
	}

	public static double calcCubicFunc(double x) {
		return x*x*x;
	}
}