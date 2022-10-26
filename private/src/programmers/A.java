package programmers;

public class A {
	public static void main(String[] args) {
		int n = 123;
		int sum = 0;
		String str = n + "";
		String[] arr = str.split("");
		
		for(int i=0; i<arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		
		System.out.println(sum);
	}
	

}
