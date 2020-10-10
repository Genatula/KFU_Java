public class ProblemSix_SumOfFact {
	public static void main(String[] args) {
		if (args.length < 1 || args.length > 1 || Integer.valueOf(args[0]) < 1) {
			System.out.println("Your input is not correct! Please change it");
		}
		else {
			int m = Integer.valueOf(args[0]);
			double sum = 0;
			double mFact = 1;
			double mFactDouble;
			for (int i=1; i <= m; i++) {
				mFactDouble = mFact*i;
				for (int j=i+1; j<=2*i; j++) {
					mFactDouble = mFactDouble * j;
				}
				sum = sum + ( mFact * mFact / mFactDouble );
				mFact = mFact * i;
			}
			System.out.println("The sum equals to " + sum);
		}
	}
}