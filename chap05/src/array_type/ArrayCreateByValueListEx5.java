package array_type;

import java.util.Iterator;

public class ArrayCreateByValueListEx5 {
	public static void main(String[] args) {
		// 선언과 초기화를 분리하려면 초기화시 new 연산자를 사용해야한다.
		int[] scores;
		scores = new int[] {100,70,50};
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		// 배열 변수에 값을 재할당 하려면 new 연산자를 사용해야한다.
		String[] names = {"홍길동","김길동"};
		names = new String[] {"박길동", "나길동"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
