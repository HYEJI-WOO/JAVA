package for_exam;

import java.util.Scanner;

public class ForSumExample3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 K까지 홀수의 합 - K값은?");
		int endValue = scanner.nextInt();
		
		int sum = 0;
		int i = 1; // 짝수의 합을 구할땐 i = 2로 선언
		for(; i<=endValue; i=i+2) {
			sum += i;
		}
		System.out.println("1부터 " + endValue + "까지의 합 : " + sum);
//		                      ex) i-1일땐 (i-1) 로 씀. -> 괄호필수
	}

}
