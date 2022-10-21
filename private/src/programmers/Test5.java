package programmers;

import java.util.Arrays;

public class Test5 {
	public static void main(String[] args) {
		String a = "cccCCC";
		
		String[] split = a.split("");
		char[] c = a.toCharArray();
		System.out.println(Arrays.toString(c));
		String result  = "";
		
		for(int i=0; i<c.length; i++) {
			if(Character.isUpperCase(c[i]) == true) {
				result += split[i].toLowerCase();
			} else {
				result += split[i].toUpperCase();
			}
		}
		System.out.println(result);
		
	}

}
