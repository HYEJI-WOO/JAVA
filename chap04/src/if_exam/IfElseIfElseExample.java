package if_exam;

import java.util.Scanner;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		
		System.out.println("������ �Է��ϼ��� >>");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score >= 90) {
			System.out.println("������ 90�� �̻��Դϴ�.");
			System.out.println("����� A��� �Դϴ�.");
		} else if(score >= 80) {
			System.out.println("������ 80�� �̻��Դϴ�.");
			System.out.println("����� B��� �Դϴ�.");
		} else if(score >= 70) {
			System.out.println("������ 70�� �̻��Դϴ�.");
			System.out.println("����� C��� �Դϴ�.");
		} else if(score >= 60) {
			System.out.println("������ 60�� �̻��Դϴ�.");
			System.out.println("����� D��� �Դϴ�.");
		} else {
			System.out.println("������ 60�� �̸��Դϴ�.");
			System.out.println("����� E��� �Դϴ�.");
		}
		System.out.println("���θ޼ҵ� ����");
	}

}
