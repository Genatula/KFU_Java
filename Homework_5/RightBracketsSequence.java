public class RightBracketsSequence {
	public static void main(String[] args) {
		System.out.println(isRightSequence("(())"));
		System.out.println(isRightSequence("(()"));
		System.out.println(isRightSequence(")(())"));
		System.out.println(isRightSequence("(())())"));

	}

	public static boolean isRightSequence(String sequence) {
		return isRightSequence(sequence, 0);
	}

	public static boolean isRightSequence(String sequence, int flag) {
		int tempFlag = flag;
		if (sequence.charAt(0) == '(') {
			tempFlag = tempFlag + 1;
		}
		else if (sequence.charAt(0) == ')') {
			tempFlag = tempFlag - 1;
		}

		if (tempFlag < 0) {
			return false;
		}
		else if (sequence.length() == 1) {
			if (tempFlag > 0) {
				return false;
			}
			else {
				return true;
			}
		}
		else {
			return isRightSequence(sequence.substring(1), tempFlag);
		}
	}
}