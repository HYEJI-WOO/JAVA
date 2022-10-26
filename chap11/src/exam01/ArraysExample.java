package exam01;

import java.util.Arrays;

public class ArraysExample {
	public static void main(String[] args) {
		String[] arr1 = {"b","a","f","d"};
		String[] strArr = {"b","a","f","d"};
		String[][] arr2 = {
				{"1","2","3"},
				{"4","5"}
		};
		String[][] arr3 = {
				{"1","2","3"},
				{"4","5"}
		};
		System.out.println(arr1); // 참조값
		System.out.println(Arrays.toString(arr1)); // 배열의 내용
		
		System.out.println(arr2); // 참조값
		System.out.println(Arrays.toString(arr2)); // 참조값
		System.out.println(Arrays.deepToString(arr2)); // 2차원배열의 내용
		
		System.out.println(arr1==strArr);
		System.out.println(arr1.equals(strArr));
		System.out.println(Arrays.equals(strArr, arr1));
		System.out.println(Arrays.deepEquals(arr2, arr3));
	}

}
