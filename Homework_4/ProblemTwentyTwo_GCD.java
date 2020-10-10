import java.util.Scanner;

public class ProblemTwentyTwo_GCD {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two positive integers: ");

		long first = scan.nextLong();
		long second = scan.nextLong();
		long gcd = 1;

		long firstExecTime = System.currentTimeMillis();
		for (int i=2; i <= first && i <= second; i++) {
			if (first % i == 0 && second % i == 0) {
				gcd = i;
			}
		}
		long secondExecTime = System.currentTimeMillis();

		System.out.println("\n" + "The GCD, according to the 1st algorithm, equals to " + gcd); 
		System.out.println("It took " + (secondExecTime - firstExecTime) + " ms to execute the 1st algorithm" + "\n");

		firstExecTime = System.currentTimeMillis();
		while (first != 0 && second != 0) {
			if (first > second) {
				first = first % second;
			}
			else {
				second = second % first;
			}
		}
		secondExecTime = System.currentTimeMillis();

		if (first == 0) {
			gcd = second;
		}
		else {
			gcd = first;
		}

		System.out.println("The GCD, according to the 2nd algorithm, equals to " + gcd);
		System.out.println("It took " + (secondExecTime - firstExecTime) + " ms to execute the 2nd algorithm");
	}
}