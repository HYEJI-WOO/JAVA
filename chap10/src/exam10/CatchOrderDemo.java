package exam10;

import java.util.Scanner;

public class CatchOrderDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(">>회원번호 입력");
		
		
		try {
			String inputValue = scan.nextLine();
			int id = Integer.parseInt(inputValue);
			System.out.println("입력한 번호 : " + id);
		} catch (Exception e) {
			System.out.println("예외발생");
		} finally {
			//리소스 반남
			scan.close();
		}
	}

}
