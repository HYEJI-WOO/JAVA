package section2.exam05;

public class Calculator {
	
	static double pi = 3.14;
	
	static int add(int x, int y) {
		return x+y;
	}
	
	int plus(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		// 클래스 내부에서 static 메소드 호출
		int result = Calculator.add(7, 5);
		int result2 = add(7, 5);
		System.out.println(result);
		System.out.println(result2);
		
		// 클래스 내부에서 instance 메소드 호출
		// 객체생성을 해야한다.
		Calculator calculator = new Calculator();
		int result3 = calculator.plus(10, 2);
	}
}