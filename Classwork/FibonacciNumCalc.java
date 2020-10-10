import java.util.Arrays;

public class FibonacciNumCalc {
	public static void main(String[] args) {

		System.out.println(calcFibonacciNum(1));
		System.out.println(calcFibonacciNum(10));
		System.out.println(calcFibonacciNum(0));
		System.out.println(calcFibonacciNum(3));
		System.out.println(calcFibonacciNum(4));

	}

	// You need to remember calculated values

	// public static int calcFibonacciNum (int num) {
	// 	int[] fNums = new int[num];
		
	// 	fNums[0] = 1;
	// 	fNums[1] = 1;
	// 	return calcFibonacciNum(num - 1, fNums) + calcFibonacciNum(num - 2, fNums);
	// }

	// public static int calcFibonacciNum (int num, int[] fNums) {
	// 	if (num == 1 || num == 2) {
	// 		return 1;
	// 	}

	// 	else if (num < 1) {
	// 		return -1;
	// 	}

	// 	else {
	// 		return calcFibonacciNum(num - 1) + calcFibonacciNum(num - 2);
	// 	}
	// }
}