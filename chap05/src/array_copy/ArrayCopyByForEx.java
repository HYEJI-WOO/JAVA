package array_copy;

import java.util.Arrays;

public class ArrayCopyByForEx {
	public static void main(String[] args) {
		int[] score = {70,75,90,91};
		int[] newScore = new int[6];
		for(int i=0; i<score.length; i++) {
			newScore[i] = score[i];
		}
		System.out.println(Arrays.toString(newScore));
		newScore[4] = 100;
		newScore[5] = 95;
		System.out.println(Arrays.toString(newScore));
	}

}
