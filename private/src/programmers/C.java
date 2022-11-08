package programmers;

public class C {
	public static void main(String[] args) {
		int[] arr = {3,10,28};
		int n = 20;
		int answer = 0;
		int i = 0;
		int min = 1000;
		
		for(i=0; i<arr.length; i++) {
			if(min > Math.abs(arr[i]-n) && min != Math.abs(arr[i]-n)) {
				min = Math.abs(arr[i]-n);
				answer = arr[i];
			}
		}
		
		System.out.println(answer);
	}

}
