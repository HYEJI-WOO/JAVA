package information;

import java.util.Arrays;

public class BubbleSortExample {
	public static void main(String[] args) {
		int i,j;
		int temp;
		int[] arr = {75,95,85,100,50};
		for(i=0;i<4;i++) {
			for(j=0;j<4-i;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					}
				}
			}
		System.out.println(Arrays.toString(arr));
			
	}
	}

		


