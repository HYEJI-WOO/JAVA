package if_exam;

import java.util.Scanner;

public class IfElseExample2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(">>�����Է� : ");
		int score = scan.nextInt();
		ifElseTest(score);
	}

	private static void ifElseTest(int score) {
		if(score >= 90) {
			System.out.println("������ 90�� �̻��Դϴ�.");
			System.out.println("����� A��� �Դϴ�.");
		} else {
			System.out.println("������ 90�� �̸��Դϴ�.");
			System.out.println("����� B��� �Դϴ�.");
		}
		
//		if(score >= 90) {
//			System.out.println("������ 90�� �̻��Դϴ�.");
//			System.out.println("����� A��� �Դϴ�.");
//			return;
//		} 
//		System.out.println("������ 90�� �̸��Դϴ�.");
//		System.out.println("����� B��� �Դϴ�.");
//		} 
//      �� ��õ�ϴ� ��� = return ���
		
	}

}
