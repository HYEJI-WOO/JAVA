package array_type;

import java.util.Arrays;

public class ArrayCreateByNewEx {
	public static void main(String[] args) {

		int[] intArr = new int[5];
		char[] charArr = new char[5];
		float[] floatArr = new float[3];
		boolean[] boolArr = new boolean[3]; 
		String[] strArr = new String[3];
		
		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(charArr));
		System.out.println(Arrays.toString(floatArr));
		System.out.println(Arrays.toString(boolArr));
		System.out.println(Arrays.toString(strArr));
	}

}
