package section2.exam09;

public class Person {
	final String nation; 
	final String ssn;
	String name;

	public Person() {
		nation = "���ѹα�"; // �����ڿ��� �ʱ�ȭ
		ssn = "123456789"; 
	}
	
	// final �ʵ� : �������� �Ű������� �ʱ�ȭ ����
	public Person(String nation, String ssn) {
		this.nation = nation;
		this.ssn = ssn;
	}
	
}
