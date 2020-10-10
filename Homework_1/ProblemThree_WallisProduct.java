public class ProblemThree_WallisProduct {
	public static void main(String[] args) {
		if (args.length < 1 || args.length > 1 || Integer.valueOf(args[0]) < 1) {
			System.out.println("Your input is incorrect! Please change it");
		}
		else {
			int numOfTimes = Integer.valueOf(args[0]);
			float pi = 2;
			for (int i=1; i <= numOfTimes; i++) {
				pi = pi * 4 * i * i / ( (2*i - 1)*(2*i + 1) );
			}
			System.out.println("The approximate value of pi equals to " + pi);
		}
	}
}