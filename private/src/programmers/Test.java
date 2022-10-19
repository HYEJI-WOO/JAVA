package programmers;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
//		int answer = 0;
//		int MAX = 0;
//		int sum = 0;
//
//		for(int i=0; i<sides.length; i++) {
//		    sum += sides[i];
//		    if (sides[i] > MAX) MAX = sides[i];
//		}
//		sum = sum-MAX;
//
//		if(sum > MAX) answer = 1;
//		else answer = 2;
//
//		return answer; 
		
		
		 int[] arr = {4, 33, 24};
		 Arrays.sort(arr);
		 
		 int a = arr[0] + arr[1] > arr[2] ? 1 : 2;
		 
		 System.out.println(a);
}
	
}

