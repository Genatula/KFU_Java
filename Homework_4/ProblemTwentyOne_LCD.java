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
	}
}