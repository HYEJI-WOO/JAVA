package scanner_exam;

import java.util.Scanner;

public class LogicOperatorExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">>별명을 입력하세요 : ");
		String nickName = scanner.nextLine();
		
		boolean minTest = nickName.length() < 3;
		boolean maxTest = nickName.length() > 5;
		
			// int nickNameSize = nickName.length();
			// if(nickNameSize < 3 || nickNameSize > 5) { // 3글자 미만, 5글자 초과
		
		if(minTest || maxTest) {
			System.out.println("별명은 3글자이상 5글자이하로 입력하세요");
			
			return;
		}
		System.out.println("별명이 입력되었습니다.");
		System.out.println("입력한 별명 : " + nickName);
	}

}
