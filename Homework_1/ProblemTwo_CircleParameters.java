public class ProblemTwo_CircleParameters {
	public static void main(String[] args) {
        if (args.length < 1 || args.length > 1 || Integer.valueOf(args[0]) <= 0) {
        	System.out.println("Your input is not correct");
        }
        else {
            float radius = Float.valueOf(args[0]);
		    final float PI = 3.14f;
		    float length = 2.0f * radius * PI;
		    float area = PI * radius * radius;
		    System.out.println("The length equals to " + length + " and the area equals to " + area);
        }	
	}
}