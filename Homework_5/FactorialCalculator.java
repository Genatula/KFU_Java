import java.util.Scanner;

public class FactorialCalculator {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String input = scan.next();

		if (Float.valueOf(input) % 1 > 0 || Integer.valueOf(input) < 1) {
			System.out.println("Incorrect input type");
			System.exit(1);
		}

		int num = Integer.valueOf(input);

		System.out.println(num + "! equals to " + calculateFactorial(num));
	}

	public static long calculateFactorial(int num) {
		if (num == 1 || num == 0) {
			return 1;
		}

		else {
			return num * calculateFactorial(num - 1);
		}
	}
}