package operation;

public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit; // 실수 타입은 정확한 연산을 보장하지 않음
		System.out.println(result);
	}

}
