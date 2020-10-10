import java.util.Random;
import java.util.Arrays;

public class ArraySortAndAverage {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] randomNums = new int[10];
		for (int i=0; i <= 9; i++) {
			randomNums[i] = rand.nextInt(28) + 2;
		}
		System.out.println(Arrays.toString(randomNums));
		// here you need to sort the array
		for (int i = 0; i <= 9; i++) {
			for (int j = i + 1; j <= 9; j++) {
				if (randomNums[j] < randomNums[i]) {
					int temp = randomNums[i];
					randomNums[i] = randomNums[j];
					randomNums[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(randomNums));
		double av = 1;
		for (int i=0; i<=9; i++) {
			av = av * randomNums[i];
		}
		av = Math.pow(av, 0.1);
		System.out.println(av);
	}
}