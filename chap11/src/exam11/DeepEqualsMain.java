package exam11;

import java.util.Arrays;
import java.util.Objects;

public class DeepEqualsMain {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		int[] arr3 = {1,2};
		
		System.out.println(Arrays.equals(arr1, arr2)); // 요소값 비교
		System.out.println(Objects.equals(arr1, arr2)); // 참조값 비교
		System.out.println(Objects.deepEquals(arr1, arr2)); // 요소값 비교
		
		
	}

}
