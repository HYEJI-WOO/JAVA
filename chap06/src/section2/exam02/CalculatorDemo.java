package section2.exam02;

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int sum = calculator.sumAll(new int[] {10,20,30,40});
		System.out.println("합계 : " + sum);
		
		int addAll = calculator.addAll(1,2,3,4); // 매개변수의 개수가 정해져있지 않음
		System.out.println("합계 : " + addAll);
	}

}
