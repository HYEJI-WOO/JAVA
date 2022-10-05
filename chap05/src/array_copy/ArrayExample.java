package array_copy;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		
		// 원본 배열
		String[] oldStrArr = {"java", "mysql", "jsp", "oracle", "spring"};
		String[] newStrArr = new String[6];
		
		// 원본배열에서 새로운 배열로 "mysql", "jsp", "oracle" 복사하여
		// [null, null, mysql, jsp, oracle, null] 해당결과를 얻으려함
		
		System.arraycopy(oldStrArr, 1, newStrArr, 2, 3);
		// (원본 배열, 
		//  원본 배열의 몇 번 인덱스부터 복사 할지,
		//  새로운 배열,
		//  새로운 배열의 몇 번 인덱스부터 붙여 넣을지, 
		//  몇 개의 항목을 복사할지);
		System.out.println(Arrays.toString(newStrArr));
		
		// 복사된 배열은 기존 배열과 동일한 객체를 참조한다.
		System.out.println(oldStrArr[1]==newStrArr[2]);
		System.out.println(oldStrArr[2]==newStrArr[3]);
		System.out.println(oldStrArr[3]==newStrArr[4]);
	}

}
