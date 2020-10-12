import java.util.Scanner;

public class FibonacciNumCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the position of an intended Fibonacci number: ");

		String input = scan.next();

		if (Float.valueOf(input) % 1 > 0 || Integer.valueOf(input) < 1) {
			System.out.println("Incorrect input type");
			System.exit(1);
		}

		int position = Integer.valueOf(input);
		long firstTimestamp, secondTimestamp, firstDelta, secondDelta;
		long fib1 = 1l, fib2 = 1l, currentFib = 1l;

		firstTimestamp = System.currentTimeMillis();

		for (int i = 3; i <= position; i++) {
			currentFib = fib1 + fib2;
			fib2 = fib1;
			fib1 = currentFib;
		}

		secondTimestamp = System.currentTimeMillis();

		firstDelta = secondTimestamp - firstTimestamp;

		System.out.println("The Fibonacci number on position " + position + " equals to " + currentFib);
		System.out.println("It took " + firstDelta + " ms to execute the algorithm");


		firstTimestamp = System.currentTimeMillis();

		currentFib = calculateFibonacciNum(position);

		secondTimestamp = System.currentTimeMillis();

		secondDelta = secondTimestamp - firstTimestamp;

		System.out.println("\nThe Fibonacci number on position " + position + " equals to " + currentFib);
		System.out.println("It took " + secondDelta + " ms to execute the algorithm");

		System.out.println("\nFor-loop was " + (secondDelta - firstDelta) + " ms faster than recursion");
	}

	public static long calculateFibonacciNum (int position) {
		if (position == 1 || position == 2) {
			return 1l;
		}

		else {
			return calculateFibonacciNum(position - 1) + calculateFibonacciNum(position - 2);
		}
	}
}