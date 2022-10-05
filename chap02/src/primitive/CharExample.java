package primitive;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A'; // 문자를 직접 저장
		System.out.println(c1);
		char c2 = 65; // 10진수로 저장
		System.out.println(c2);
		char c3 = '\u0041'; // 16진수로 저장
		System.out.println(c3);
		
		int uniCode = c1; // 유니코드 얻기
		System.out.println(uniCode);
		
		char c4 = '가';
		System.out.println(c4);
		char c5 = 44032;
		System.out.println(c5);
		char c6 = '\uac00';
		System.out.println(c6);

		int uniCodeCh = c4;
		System.out.println(uniCodeCh);
	}
}
