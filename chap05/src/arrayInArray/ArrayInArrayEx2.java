package arrayInArray;

import java.util.Arrays;

public class ArrayInArrayEx2 {
	public static void main(String[] args) {
		String[][] players = {
				{"������","�迵��","�����","ȫö"}, // 0 
				{"���缺","Ȳ�ι�","��â��"}, // 1
				{"�̵���","�����"}, // 2
				{"Ȳ����"} // 3
		};
		
		System.out.println(players.length);
		System.out.println(players[0].length);
		System.out.println(players[1].length);
		String[] wing = players[2];
		System.out.println(Arrays.toString(wing));
		System.out.println(players[3][0]);
		System.out.println(players[0][2]);
		
		for (int i = 0; i < players.length; i++) {
			for (int j = 0; j < players[i].length; j++) {
				System.out.println(players[i][j]);
			}
			}
		}
}