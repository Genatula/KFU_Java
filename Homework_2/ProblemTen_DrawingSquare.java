public class ProblemTen_DrawingSquare {
	public static void main(String[] args) {
		if (args.length != 1 || Double.valueOf(args[0]) % 1 != 0 || Integer.valueOf(args[0]) <= 0) {
			System.out.println("Your input is incorrect! Please change it");
		}
		else {
			int side = Integer.valueOf(args[0]);
			for (int i=1; i <= side; i++) {
				if (i == 1 || i == side) {
					System.out.println("");
					for (int j=1; j <= side; j++) {
						System.out.print("* ");
					}
				}
				else {
					System.out.println("");
					System.out.print("*");
					for (int k=1; k <= side - 2; k++) {
						System.out.print("  ");
					}
					System.out.print(" ");
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}