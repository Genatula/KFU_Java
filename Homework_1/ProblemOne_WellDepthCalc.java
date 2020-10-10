public class ProblemOne_WellDepthCalc {
	public static void main(String[] args) {
		if (args.length < 1 || args.length > 1 || Integer.valueOf(args[0]) <= 0) {
			System.out.println("Your input is not correct");
		} 
		else {
			float time = Float.valueOf(args[0]);
	        final float G = 9.78f;
	        float h = G * time * time / 2.0f;
	        System.out.println("The height equals to " + h + " metres");
		}
	}
}