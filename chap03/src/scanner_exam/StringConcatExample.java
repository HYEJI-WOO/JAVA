package scanner_exam;

public class StringConcatExample {
	public static void main(String[] args) {
		
		String str1 = "JDK" + 3 + 3.0; // JDK33.0
		String str2 = 3 + 3.0 + "JDK"; // 6.0JDK
		// 문자열 + 숫자 + 숫자 = 모두 문자열로 출력
		// 숫자 + 숫자 + 문자열 = 연산 후 문자열 출력 
			System.out.println("str1 : " + str1);
			System.out.println("str2 : " + str2);
			
			System.out.println("덧셈결과 " + (10+2));
			System.out.println("곱셈결과 " + 10*2);
	}

}
