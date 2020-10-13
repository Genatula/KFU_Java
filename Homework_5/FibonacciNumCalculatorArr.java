import java.util.Scanner;

public class FibonacciNumCalculatorArr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the position of an intended Fibonacci number: ");

		String input = scan.next();

		if (Float.valueOf(input) % 1 > 0 || Integer.valueOf(input) < 1) {
			System.out.println("Incorrect input type");
			System.exit(1);
		}

		int position = Integer.valueOf(input);

		long firstTimestamp = System.nanoTime();

		System.out.println("The Fibonacci number on position " + position + " equals to " + calculateFibonacciNum(position));

		long secondTimestamp = System.nanoTime();

		System.out.println("It took " + (secondTimestamp - firstTimestamp) + " nanos to execute the algorithm");
	}

	public static long calculateFibonacciNum (int position) {
		long[] fNums = new long[position];
		fNums[0] = 1l;
		if (position > 1) {
			fNums[1] = 1l;
		}
		return calculateFibonacciNum(position - 1, fNums);
	}

	public static long calculateFibonacciNum (int position, long[] nums) {
		long[] tempNums = nums;

		if (tempNums[position] == 0) {
			tempNums[position] = calculateFibonacciNum(position - 1, tempNums) + calculateFibonacciNum(position - 2, tempNums);
		}

		else {
			return tempNums[position];
		}

		return tempNums[position];	

	}
}
