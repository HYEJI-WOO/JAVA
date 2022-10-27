package programmers;

import java.util.*;

public class A {
	public static void main(String[] args) {
		String my_string = "people";
		String result = "";
		
		for(int i=0; i<my_string.length(); i++) {
			if(my_string.indexOf(my_string.charAt(i)) == i) {
				result += my_string.charAt(i);
			}
		}
		System.out.println(result);
	}
}