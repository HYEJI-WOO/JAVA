package primitive;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A'; // ���ڸ� ���� ����
		System.out.println(c1);
		char c2 = 65; // 10������ ����
		System.out.println(c2);
		char c3 = '\u0041'; // 16������ ����
		System.out.println(c3);
		
		int uniCode = c1; // �����ڵ� ���
		System.out.println(uniCode);
		
		char c4 = '��';
		System.out.println(c4);
		char c5 = 44032;
		System.out.println(c5);
		char c6 = '\uac00';
		System.out.println(c6);

		int uniCodeCh = c4;
		System.out.println(uniCodeCh);
	}
}
