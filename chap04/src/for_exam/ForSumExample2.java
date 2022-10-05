package for_exam;

import java.util.Scanner;

public class ForSumExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 K까지의 합 - K값은?");
		int endValue = scanner.nextInt();
		
		int sum = 0;
		int i = 1;
		for(; i<=endValue; i++) {
			sum += i;
		}
		System.out.println("1부터 " + endValue + "까지의 합 : " + sum);
//		                      ex) i-1일땐 (i-1) 로 씀. -> 괄호필수
	}

}
