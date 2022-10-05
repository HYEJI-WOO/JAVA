package scanner_exam;

import java.util.Scanner;

public class CompareOperatorExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(">> 첫 번째 값 입력 : ");
		int inputInt = scan.nextInt();
		System.out.println(">> 두 번째 값 입력 : ");
		int inputInt2 = scan.nextInt();
		
		if(inputInt==inputInt2) {
			System.out.println("두 입력값은 같다.");
			return;
		}
		if(inputInt!=inputInt2) {
			System.out.println("두 입력값은 다르다.");
		}
		if(inputInt>inputInt2) {
			System.out.println("첫 번째 입력값이 더 크다.");
			return;
		}
		if(inputInt<inputInt2) {
			System.out.println("두 번째 입력값이 더 크다.");
		}
	}

}
