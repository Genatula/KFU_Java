public class ProblemEleven_MultiplicationTable {
	public static void main(String[] args) {
		if (args.length != 1 || Double.valueOf(args[0]) % 1 != 0 || Integer.valueOf(args[0]) < 1) {
			System.out.println("Your input is incorrect! Please change it");
		}
		else {
			int num = Integer.valueOf(args[0]);
			for (int i=0; i <= num; i++) {
				boolean numOfDig = (i == 10);
				for (int j=0; j <= num; j++) {
					if (i == 0) {
						System.out.print(j + "  ");
					}
					else if (j == 0) {
						String out = numOfDig ? " " : "  ";
						System.out.print(i + out);
					}
					else {
						System.out.print(i*j);
						if (i*j / 10 == 0) {
							System.out.print("  ");
						}
						else {
							System.out.print(" ");
						}
					}
				}
				System.out.println("");
			}
		}
	}
}