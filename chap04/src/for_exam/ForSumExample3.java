package for_exam;

import java.util.Scanner;

public class ForSumExample3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1���� K���� Ȧ���� �� - K����?");
		int endValue = scanner.nextInt();
		
		int sum = 0;
		int i = 1; // ¦���� ���� ���Ҷ� i = 2�� ����
		for(; i<=endValue; i=i+2) {
			sum += i;
		}
		System.out.println("1���� " + endValue + "������ �� : " + sum);
//		                      ex) i-1�϶� (i-1) �� ��. -> ��ȣ�ʼ�
	}

}
