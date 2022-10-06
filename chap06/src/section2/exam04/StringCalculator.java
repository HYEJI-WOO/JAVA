package section2.exam04;

public class StringCalculator {
	
	int add(int a, int b) {
		return a+b;
	}
	
	int add(String a, String b) {
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		return num1 + num2;
	}
	
	int add(String a, int b) {
		int num = Integer.parseInt(a);
		return num+b;
	}
	
	int add(int a, String b) {
		int num = Integer.parseInt(b);
		return a+num;
	}
}