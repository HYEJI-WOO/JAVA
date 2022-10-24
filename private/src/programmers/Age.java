package programmers;

import java.util.Arrays;

public class Age {
	public static void main(String[] args) {
		int age = 23;
		String str = Integer.toString(age);
		String[] arr = str.split("");
		String result = "";
		
		for(int i=0; i<arr.length; i++) {
			int num = 97 + Integer.parseInt(arr[i]);
			result += (char)num;
		}
		System.out.println(result);
		
	}

}
