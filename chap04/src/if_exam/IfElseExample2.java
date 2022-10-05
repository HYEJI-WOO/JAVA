package if_exam;

import java.util.Scanner;

public class IfElseExample2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(">>점수입력 : ");
		int score = scan.nextInt();
		ifElseTest(score);
	}

	private static void ifElseTest(int score) {
		if(score >= 90) {
			System.out.println("점수는 90점 이상입니다.");
			System.out.println("등급은 A등급 입니다.");
		} else {
			System.out.println("점수는 90점 미만입니다.");
			System.out.println("등급은 B등급 입니다.");
		}
		
//		if(score >= 90) {
//			System.out.println("점수는 90점 이상입니다.");
//			System.out.println("등급은 A등급 입니다.");
//			return;
//		} 
//		System.out.println("점수는 90점 미만입니다.");
//		System.out.println("등급은 B등급 입니다.");
//		} 
//      더 추천하는 방식 = return 사용
		
	}

}
