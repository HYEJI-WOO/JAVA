package primitive;

public class CharExample2 {
	public static void main(String[] args) {
		// String 타입
		// 공백문자, 빈문자 모두 허용
		String empty1 = ""; // 초기화 O, 빈문자
//		String empty1 // 초기화 X
		String whiteSpace1 = " ";
		
		// char 타입 공백문자허용, 빈문자 허용하지 않음
//		char empty2 = ''; // 빈문자를 허용하지 않음. 컴파일 에러
		char whiteSpace2 = ' '; // 공백문자 가능
	}

}
