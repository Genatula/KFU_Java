import java.util.Scanner;
import java.util.Arrays;

public class ProblemTwentySeven_IndexOfSubarray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n" + "Enter the length of the 1st array: " + "\n");
		int len1 = scan.nextInt();
		int[] arr1 = new int[len1];
		System.out.println("\n" + "Enter " + len1 + " elements of the 1st array" + "\n");
		for (int i=0; i < len1 && scan.hasNextInt(); i++) {
			arr1[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println("\n" + "Enter the length of the 2nd array: " + "\n");
		int len2 = scan.nextInt();
		int[] arr2 = new int[len2];
		System.out.println("\n" + "Enter " + len2 + " elements of the 2nd array" + "\n");
		for (int i=0; i < len2 && scan.hasNextInt(); i++) {
			arr2[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(arr2));

		int flag = 0;
		int i = 0;
		while (flag != arr2.length && !(arr1.length - i < arr2.length && flag == 0)) {
			if (arr1[i] != arr2[flag]) {
				flag = 0;
			}
			if (arr1[i] == arr2[flag]) {
				flag = flag + 1;
			}
			i = i + 1;
		}

		if (flag == arr2.length) {
			System.out.println(i - arr2.length);
		}
		else {
			System.out.println(-1);
		}
 	}
}