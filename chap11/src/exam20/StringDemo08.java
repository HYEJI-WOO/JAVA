package exam20;

public class StringDemo08 {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		// �ε���2������ ������
		String substring1 = ssn.substring(2);
		System.out.println(substring1);
		
		// �ε���7 ~ �ε���13(�������� ����)
		String substring2 = ssn.substring(7, 13);
		System.out.println(substring2);
	}

}
