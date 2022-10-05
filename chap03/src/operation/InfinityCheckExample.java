package operation;

public class InfinityCheckExample {
	public static void main(String[] args) {

		// 실수타입 0.0 또는 0.0f로 나누는 경우
		int x = 5;
		int y = -10;
		double d = 0.0;
		System.out.println(x/d); // Infinity
		System.out.println(y/d); // -Infinity
		
		float f = 0.0f;
		System.out.println(x/f); // Infinity
 		System.out.println(y/f); // -Infinity
 		
 		
 		// 래퍼클래스 Wrapper
 		System.out.println("래퍼클래스");
 		System.out.println(Double.POSITIVE_INFINITY);
 		System.out.println(Double.NEGATIVE_INFINITY);
 		System.out.println(Float.POSITIVE_INFINITY);
 		System.out.println(Float.NEGATIVE_INFINITY);
 		
 		boolean infinite = Double.isInfinite(x/d); // Infinity이면 true 아니면 false
 		System.out.println(infinite);
 		boolean finite = Double.isFinite(x/d); // finite이면 true 아니면 false
 		System.out.println(finite);
 		
		
		System.out.println("메인 종료");
	}

}
