package programmers;

import java.util.Arrays;

public class Number {
	public static void main(String[] args) {
		int sum=0;
		String my_string = "aAb1B2cC34oOp";
		String result = my_string.replaceAll("[^0-9]", "");
		String[] split = result.split("");
		System.out.println(Arrays.toString(split));
		
		for(int i=0; i<split.length; i++) {
			sum += Integer.parseInt(split[i]);
		}
		
		System.out.println(sum);
	}

}
