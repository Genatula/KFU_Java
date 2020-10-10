public class ProblemFive_ContinuedFraction {
	public static void main(String[] args) {
		if (args.length != 1 || Integer.valueOf(args[0]) < 0) {
			System.out.println("Your input is not correct! Please change it");
		}
		else {
			int numOfFrac = Integer.valueOf(args[0]);
			double fraction = 0.0;
			for (int i=numOfFrac; i >= 1; i--) {
				fraction = Double.valueOf(numOfFrac) / (i + 1 + fraction);
			}
			fraction = fraction + 1;
			System.out.println("The fraction equals to " + fraction);
		}
	}
}