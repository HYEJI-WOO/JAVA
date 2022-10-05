package scanner_exam;

public class StringEqualsDemo {
	public static void main(String[] args) {
		String str1 = new String("全辨悼"); // 按眉积己
		String str2 = new String("全辨悼"); // 按眉积己
		System.out.println(str1==str2); // 曼炼蔼 厚背 false
 		System.out.println(str1.equals(str2)); // 蔼 厚背(equals) true
		// 积己磊 规侥
		
		String str3 = "全辨悼"; // 按眉积己
		String str4 = "全辨悼"; // 按眉积己 酒丛
		String str5 = "全辨悼"; 
		System.out.println(str3==str4); // true
		// 府磐凡 规侥
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
	}

}