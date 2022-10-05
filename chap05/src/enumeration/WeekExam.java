package enumeration;

public class WeekExam {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		// name() �̸�
		String name = today.name();
		System.out.println(name); // name�޼ҵ� ���
		System.out.println(today); // �׳� ���
		
		// ordinal() ����
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		System.out.println(Week.FRIDAY.ordinal());
		
		// ���� ��ü ��
		Week day1 = Week.MONDAY; // 1
		Week day2 = Week.WEDNESDAY; // 3
		
		// ����� ��ġ �μ�(����)
		// day1�� day2�� �������� ��� ��ġ���ִ°�
		int result1 = day1.compareTo(day2); // MONDAY(1)-WEDNESDAY(3)
		
		// day2�� day1�� �������� ��� ��ġ���ִ°�
		int result2 = day2.compareTo(day1); // WEDNESDAY(3)-MONDAY(1)
		
		System.out.println(result1); // -2
		System.out.println(result2); // 2
	}
}