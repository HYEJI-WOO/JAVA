package while_exam;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		
		Scanner scan = new Scanner(System.in);
		String inputString = null;
		
		do {
			System.out.print(">>");
			inputString = scan.nextLine();
			System.out.println("�Է��� �� : " + inputString);
		} while (!inputString.equals("q"));
		System.out.println("���α׷��� �����մϴ�.");
	}

}
