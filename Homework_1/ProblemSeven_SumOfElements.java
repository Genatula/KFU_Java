public class ProblemSeven_SumOfElements {
	public static void main(String[] args) {
		if (args.length < 1 || args.length > 1 || Integer.valueOf(args[0]) <= 0) {
			System.out.println("Your input is not correct");
		}
		else {
			int num = Integer.valueOf(args[0]);
			double sum = 0.0;
			for (int i = 1; i <= num; i++) {
				sum = sum + Math.pow(-1, i + 1)/Math.pow(2*i - 1, 2);
			}
			System.out.println("The sum of the first " + num + " elements equals to " + sum);
		}
	}
}