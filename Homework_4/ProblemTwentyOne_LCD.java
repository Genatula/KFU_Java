import java.util.Scanner;

public class ProblemTwentyOne_LCD {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two positive integers: ");
		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();
		long product = firstNum * secondNum;
		int gcd;
		while (firstNum != 0 && secondNum != 0) {
			if (firstNum > secondNum) {
				firstNum = firstNum % secondNum;
			}
			else {
				secondNum = secondNum % firstNum;
			}
		}
		if (firstNum == 0) {
			gcd = secondNum;
		}
		else {
			gcd = firstNum;
		}
		long lcd = product / gcd;
		System.out.println("The LCD equals to " + lcd);

		// long[] nums = new long[(int)product + 1];
		// nums[0] = 1;
		// for (int i = 1; i <= product; i++) {
		// 	nums[i] = i;
		// }
		// lcd = Integer.MAX_VALUE;
		// for (long num : nums) {
		// 	if ((num % firstNum) == 0 && (num % secondNum) == 0) {
		// 		lcd = num;
		// 		break;
		// 	}
		// }
		// System.out.println("The LCD equals to " + lcd);
 	}
}