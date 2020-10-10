public class ProblemNine_CircleAndPoint {
	public static void main(String[] args) {
		if (args.length != 5 || Double.valueOf(args[2]) <= 0) {
			System.out.println("Your input is not correct! Please change it");
		}
		else {
			double xCircle = Double.valueOf(args[0]);
			double yCircle = Double.valueOf(args[1]);
			double radius = Double.valueOf(args[2]);
			double xPoint = Double.valueOf(args[3]);
			double yPoint = Double.valueOf(args[4]);
			
			if (Math.pow(xCircle - xPoint, 2) + Math.pow(yCircle - yPoint, 2) == Math.pow(radius, 2)) {
				System.out.println("The point belongs to the circle");
			}
			else {
				System.out.println("The point doesn't belong to the circle");
			}
		}
	}
}