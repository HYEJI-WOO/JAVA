package enumeration;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		// ��ü���� : new ������ - ���⼭ ����� ��
		String str = new String("ȫ�浿");

		// ��������� ������ ���°� : new �����ڸ� ���ؼ� ��ü���� �Ұ���
		Calendar now = Calendar.getInstance();
//		System.out.println(now);
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1; // MONTH : 0~11
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		// �빮�ڷ� ���� ctrl+shift+x
		// �ҹ��ڷ� ���� ctrl+shift+y
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year+"�� "+(month+1)+"�� "+day+"��");
		System.out.println(week);
		System.out.println(hour+"�� "+minute+"�� "+second+"��");
	}

}
