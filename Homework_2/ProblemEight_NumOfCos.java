public class ProblemEight_NumOfCos {
	public static void main(String[] args) {
		if (args.length != 2 || Double.valueOf(args[0]) % 1 != 0 || Integer.valueOf(args[0]) < 0) {
			System.out.println("Your input is incorrect! Please change it");
		}
		else {
			int numOfCos = Integer.valueOf(args[0]);
			double x = Double.valueOf(args[1]);
			double finalCos = x;

			for (int i=1; i <= numOfCos; i++) {
				finalCos = x + Math.cos(finalCos);
			}

			finalCos = Math.cos(finalCos);
			
			System.out.println("The cos equals to " + finalCos);
		}
	}
}