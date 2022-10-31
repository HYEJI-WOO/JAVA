package exam21;

public class StringBuilderExam {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		// ���ڿ� �߰�
		sb.append("Java ");
		sb.append("Program Study");
		sb.append("!!");
		// ���ۿ� �ִ� ���� String Ÿ������ ��ȯ
		System.out.println(sb.toString());
		
		// ���ڿ� �߰��� �־��� �Ű��� �߰�
		sb.insert(4, "11"); // �ε���4�� ��ġ�� ���� �߰�
		System.out.println(sb.toString());
		
		// �ε���5�� ���ڸ� 7�� ����
		sb.setCharAt(5, '7');
		System.out.println(sb.toString());
		
		// �ε���4 ~ �ε���5���� ���ڿ��� Book���� ��ü
		sb.replace(4, 6, "Book");
		System.out.println(sb.toString());
		
		// �ε���4 ~ �ε���7���� ����
		sb.delete(4, 8);
		System.out.println(sb.toString());
		
		// �� ���� �� ���
		System.out.println(sb.length());
		
	}

}
