package if_exam;

import java.util.Scanner;

public class IfNestedExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� >> ");
		int score = scanner.nextInt();
		String grade = null; // ����Ÿ��(�� �빮��)�� null�� �ʱ�ȭ / ����Ÿ��(�� �ҹ���)
		
		if(score >= 90) grade = score>=95 ? "A+" : "A";
		else grade = score>=85 ? "B+" : "B";
		
		System.out.println("���� : " + grade);
	}

}
