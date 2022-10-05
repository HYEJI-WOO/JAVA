package array_type;

public class ArrayCreateByValueListEx4 {
	public static void main(String[] args) {
		
		// {}이용한 배열 생성 방식은 선언과 초기화를 분리할 수 없다.
		int[] scores;
//		scores = {100, 70, 50}; // 컴파일 에러
		
		// 또한 배열 값을 재할당할 수 없다.
		String[] names = {"홍길동", "김길동"};
//		names[] {"박길동", "나길동"}; // 컴파일 에러
		
		
	}
}
