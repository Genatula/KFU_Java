import java.util.Scanner;

public class ProblemTwentySix_Pascal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Define the number of rows: ");
		int rows = scan.nextInt();

		long n = 1;
		long d = 1;

		for (int l = rows - (int)Math.ceil(rows / 2); l < rows; l++) {
			n = n * l;
		}
		for (int k = 1; k <= (int)Math.ceil(rows / 2); k++) {
			d = d * k;
		}

		int space = (int) Math.log10(n / d) + 1;

		System.out.println("The size of a space = " + space);

		System.out.println("The size of the last row is " + (rows * space + rows - 1));
		
		for (int i = 0; i < rows; i++) {
			for (int s = 1; s <= (rows - 1 - i)*(space + 1)/2; s++) {
					System.out.print(" ");
				}
			for (int j = 0; j <= i; j++) {
				long numerator = 1;
				long denominator = 1;
				for (int l = i - j + 1; l <= i; l++) {
					numerator = numerator * l;
				}
				for (int k = 1; k <= j; k++) {
					denominator = denominator * k;
				}
				System.out.printf("%-" + (space+1) + "d", numerator / denominator);
			}

			System.out.print("\n");
		}
	}
}