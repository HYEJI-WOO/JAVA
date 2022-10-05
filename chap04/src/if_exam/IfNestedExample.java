package if_exam;

import java.util.Scanner;

public class IfNestedExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요 >> ");
		int score = scanner.nextInt();
		String grade = null; // 참조타입(앞 대문자)은 null로 초기화 / 원시타입(앞 소문자)
		
		if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			} else { 
				grade = "A";
			}
			
		} else {
			if(score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		System.out.println("학점 : " + grade);
	}

}
