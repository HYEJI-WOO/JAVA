package switch_exam;

import java.util.Scanner;

public class SwitchStringExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� >> ");
		String position = scanner.nextLine();
		
		switch (position) {
		case "����":
			System.out.println("700����");
			break;
		case "����":
			System.out.println("500����");
			break;
		default:
			System.out.println("300����");
			break;
		}
	}

}
