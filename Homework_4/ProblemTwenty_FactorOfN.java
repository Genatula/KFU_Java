import java.util.Scanner;

public class ProblemTwenty_FactorOfN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		String input = scan.next();
		if (Math.abs(Float.valueOf(input) % 1) > 0 || Integer.valueOf(input) <= 0) {
			System.out.println("Your input is incorrect");
			System.exit(1);
		}

		int num = Integer.valueOf(input);
		int maxFact = (int)Math.floor(num / 2);
		System.out.println("The factors are the following numbers: \n");
		for (int i = 1; i <= maxFact; i++) {
			if (num % i == 0) {
				System.out.print(" " + i);
			}
		}
		System.out.print(" " + num);
		System.out.print("\n");

	}
}