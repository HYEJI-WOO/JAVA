package programmers;

import java.util.Arrays;

public class Big {
	public static void main(String[] args) {
		int[] numbers = {0,31,24,10,1,9};
		int x = numbers.length;
		int max = 0;
		Arrays.sort(numbers);
		
		max = numbers[x-1] * numbers[x-2];
		System.out.println(max);
		
	}

}
