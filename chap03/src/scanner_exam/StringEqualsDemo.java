package scanner_exam;

public class StringEqualsDemo {
	public static void main(String[] args) {
		String str1 = new String("ȫ�浿"); // ��ü����
		String str2 = new String("ȫ�浿"); // ��ü����
		System.out.println(str1==str2); // ������ �� false
 		System.out.println(str1.equals(str2)); // �� ��(equals) true
		// ������ ���
		
		String str3 = "ȫ�浿"; // ��ü����
		String str4 = "ȫ�浿"; // ��ü���� �ƴ�
		String str5 = "ȫ�浿"; 
		System.out.println(str3==str4); // true
		// ���ͷ� ���
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
	}

}