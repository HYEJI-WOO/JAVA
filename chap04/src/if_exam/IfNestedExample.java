package if_exam;

import java.util.Scanner;

public class IfNestedExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� >> ");
		int score = scanner.nextInt();
		String grade = null; // ����Ÿ��(�� �빮��)�� null�� �ʱ�ȭ / ����Ÿ��(�� �ҹ���)
		
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
		System.out.println("���� : " + grade);
	}

}
