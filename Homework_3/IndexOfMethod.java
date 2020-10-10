public class IndexOfMethod {
	public static void main(String[] args) {
		if (args.length != 2 ) {
			System.out.println("Your input is incorrect! Please change it");
		}
		else if (args[0].length() == 0 || args[1].length() == 0) {
			System.out.println(-1);
		}
		else {
			int flag = 0;
			String searchIn = args[0];
			String searchFor = args[1];
			int index = -1;
			for (int i = 0; i <= searchIn.length() - 1; i++) {
				if (searchFor.length() > searchIn.length() - i && flag == 0) {
					break;
				}
				if (searchIn.charAt(i) == searchFor.charAt(flag)) {
					flag = flag + 1;
					if (flag == searchFor.length()) {
						index = i - searchFor.length() + 1;
						break;
					}
				}
				else {
					if (searchIn.charAt(i) != searchFor.charAt(flag) && searchIn.charAt(i) == searchFor.charAt(0)) {
						flag = 1;
					}
					else {
						flag = 0;
					}
				}
			}

			System.out.println(index);
		}
	}
}