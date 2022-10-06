package section2.exam04;

public class StringCalculatorDemo {
	public static void main(String[] args) {
		StringCalculator calculator = new StringCalculator();
		
		int result1 = calculator.add(10, 2);
		int result2 = calculator.add("10", "2");
		int result3 = calculator.add("10", 2);
		int result4 = calculator.add(10, "2");
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		// 잘못된 매개값 전달
		int result5 = calculator.add("abcd", "2");
		System.out.println(result5);
		
	}

}
