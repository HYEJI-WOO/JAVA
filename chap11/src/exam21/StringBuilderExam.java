package exam21;

public class StringBuilderExam {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		// 문자열 추가
		sb.append("Java ");
		sb.append("Program Study");
		sb.append("!!");
		// 버퍼에 있는 것을 String 타입으로 변환
		System.out.println(sb.toString());
		
		// 문자열 중간에 주어진 매개값 추가
		sb.insert(4, "11"); // 인덱스4의 위치에 글자 추가
		System.out.println(sb.toString());
		
		// 인덱스5의 문자를 7로 변경
		sb.setCharAt(5, '7');
		System.out.println(sb.toString());
		
		// 인덱스4 ~ 인덱스5까지 문자열을 Book으로 대체
		sb.replace(4, 6, "Book");
		System.out.println(sb.toString());
		
		// 인덱스4 ~ 인덱스7까지 삭제
		sb.delete(4, 8);
		System.out.println(sb.toString());
		
		// 총 문자 수 얻기
		System.out.println(sb.length());
		
	}

}
