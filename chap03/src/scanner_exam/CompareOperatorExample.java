package scanner_exam;

import java.util.Scanner;

public class CompareOperatorExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(">> ù ��° �� �Է� : ");
		int inputInt = scan.nextInt();
		System.out.println(">> �� ��° �� �Է� : ");
		int inputInt2 = scan.nextInt();
		
		if(inputInt==inputInt2) {
			System.out.println("�� �Է°��� ����.");
			return;
		}
		if(inputInt!=inputInt2) {
			System.out.println("�� �Է°��� �ٸ���.");
		}
		if(inputInt>inputInt2) {
			System.out.println("ù ��° �Է°��� �� ũ��.");
			return;
		}
		if(inputInt<inputInt2) {
			System.out.println("�� ��° �Է°��� �� ũ��.");
		}
	}

}
