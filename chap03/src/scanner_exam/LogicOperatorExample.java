package scanner_exam;

import java.util.Scanner;

public class LogicOperatorExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">>������ �Է��ϼ��� : ");
		String nickName = scanner.nextLine();
		
		boolean minTest = nickName.length() < 3;
		boolean maxTest = nickName.length() > 5;
		
			// int nickNameSize = nickName.length();
			// if(nickNameSize < 3 || nickNameSize > 5) { // 3���� �̸�, 5���� �ʰ�
		
		if(minTest || maxTest) {
			System.out.println("������ 3�����̻� 5�������Ϸ� �Է��ϼ���");
			
			return;
		}
		System.out.println("������ �ԷµǾ����ϴ�.");
		System.out.println("�Է��� ���� : " + nickName);
	}

}
