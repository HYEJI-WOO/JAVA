package programmers;

import java.util.Arrays;

public class Index {
	public static void main(String[] args) {
		String my_string = "helvo";
		int num1 = 1;
		int num2 = 2;
		
		char[] arr = my_string.toCharArray();
		
		char temp = arr[num2];
		arr[num2] = arr[num1];
		arr[num1] = temp;
		
		System.out.println(Arrays.toString(arr));
	

	}

}
