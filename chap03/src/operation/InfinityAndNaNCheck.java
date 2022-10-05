package operation;

public class InfinityAndNaNCheck {
	public static void main(String[] args) {
		
		double infinity1 = 5/0.0; // Infinity
		double nan1 = 5%0.0; // NaN
		
		System.out.println(Double.isInfinite(infinity1)); 
		System.out.println(Double.isNaN(nan1)); 
		
		float infinity2 = 5/0.0f;
		float nan2 = 5%0.0f;
		
		System.out.println(Float.isInfinite(infinity2));
		System.out.println(Float.isNaN(nan2));
	}

}
