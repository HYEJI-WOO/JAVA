package scanner_exam;

public class ValueOfExample {
	public static void main(String[] args) {
		String value1 = "1000";
		String value2 = "2000";
		System.out.println(value1+value2); // 10002000
		
		double dvalue1 = Double.valueOf(value1);
		double dvalue2 = Double.valueOf(value2);
		System.out.println(dvalue1+dvalue2); // 3000.0
		
		int ivalue1 = Integer.valueOf(value1);
		int ivalue2 = Integer.valueOf(value2);
		System.out.println(ivalue1+ivalue2); // 3000
		
		String hello = "Hello";
		try {
			int ihello = Integer.valueOf(hello); //NumberFormatException 예외발생			
		} catch (Exception e) {
			System.out.println("숫자로 바꿀 수 없음");
		}
		
		System.out.println("메인 끝");
	}
}
