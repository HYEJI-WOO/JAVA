package arrayInArray;

import java.util.Arrays;

public class ArrayInArrayEx {
	public static void main(String[] args) {
		
		int[][] arrayInArray = new int[3][6];
		
		// 행렬 구조와 동일 3X6
		arrayInArray = new int[][] {
				{00,01,02,03,04,05}, 
				{10,11,12,13,14,15}, 
				{20,21,22,23,24,25}, 
		};
		
		System.out.println(arrayInArray[1][3]);
		System.out.println(arrayInArray[2][5]);
		System.out.println(arrayInArray.length); // 행의 길이
		System.out.println(arrayInArray[0].length); // 6
		System.out.println(arrayInArray[1].length); // 6
		System.out.println(arrayInArray[2].length); // 6
		
		System.out.println(Arrays.deepToString(arrayInArray));
		System.out.println(Arrays.toString(arrayInArray));
		System.out.println("==================구분선==================");
		
		for (int i = 0; i < arrayInArray.length; i++) {
			for (int j = 0; j < arrayInArray[i].length; j++) {
				System.out.println(arrayInArray[i][j]);
				
			}
			
		}
	}
}
