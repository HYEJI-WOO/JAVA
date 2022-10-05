package array_type;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayCreateByValueListEx6 {
	public static void main(String[] args) {
		int[] myArr = {10,20,30,40};
		int addALL = addALL(myArr);
		System.out.println(addALL);
		
		// 배열의 목록 값을 다음 처럼 전달할 수 없다.
//		int result = addALL({10,20,30}); // 컴파일 에러
		
		// 배열의 목록을 전달하려면 new 연산자를 사용해야한다.
		int result = addALL(new int[] {10,20,30});
		System.out.println(result);
		
	}
	
	public static int addALL(int[] arr) { // {10,20,30,40}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
