package array_type;

public class ArrayCreateByValueListEx2 {
	public static void main(String[] args) {
		// 배열의 선언과 초기화
		int[] scores = {83, 90, 87, 70, 75};
		// 배열의 길이 : 요소의 개수(5개)
		System.out.println(scores.length); // 5
		
		// 반복문으로 배열 요소에 접근
		for (int i = 0; i < 5; i++) {
			System.out.println(scores[i]);
		}
		
		String[] names = {"홍길동", "김길동", "박길동"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		boolean[] flags = {false, true, false, true, true};
		for (int i = 0; i < flags.length; i++) {
			System.out.println(flags[i]);
		}
	}

}
