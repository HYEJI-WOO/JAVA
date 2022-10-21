package programmers;

import java.util.Arrays;

public class Hint {
	public static void main(String[] args) {
		// split(구분자)
		String test = "hello";
		String[] split = test.split("");
		System.out.println(Arrays.toString(split));
		
		// toCharArray
		char[] charArray = test.toCharArray();
		System.out.println(Arrays.toString(charArray));
		
		// indexOf()
		int indexOf = test.indexOf("h");
		int indexOf2 = test.indexOf("l"); // 2
		System.out.println(indexOf);
		System.out.println(indexOf2);
		System.out.println(test.indexOf("H")); // 찾는 문자열이 없는 경우 -1
		System.out.println(test.indexOf("llo"));
		
		// replaceAll(이전문자열, 대치문자열)
		String replaceAll = test.replaceAll("l", "?");
		System.out.println(replaceAll);
		
		// charAt
		System.out.println(test.charAt(0)); // h
		System.out.println(test.charAt(1)); // e
		System.out.println(test.charAt(2)); // l
		System.out.println(test.charAt(3)); // l
		System.out.println(test.charAt(4)); // o
		
		Arrays.sort(split);
				
	}

}
