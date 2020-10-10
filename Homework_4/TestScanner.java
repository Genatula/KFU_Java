import java.util.Scanner;
import java.util.Arrays;

public class TestScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[10];
		int flag = 0;
		System.out.println("Please enter 10 integers");
		while (scan.hasNextInt() && flag < 10) {
			numbers[flag] = scan.nextInt();
			flag = flag + 1;
		}
		System.out.println(Arrays.toString(numbers));
	}
}