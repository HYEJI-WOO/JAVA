package exam11;

public class Demo { // class �� final = ��� �Ұ�
	
	final int a;
	
	public Demo(int a) {
		this.a = 10;
	}
	
	public final void methodAA() {
		System.out.println("�������̵� ����");
	}
	
	public static void main(String[] args) {
		final int test;
		test = 10; // �ʱ�ȭ
//		test = 15; // ���Ҵ�
		System.out.println(test);
		Demo demo = new Demo(20); // �����ڿ��� �ʱ�ȭ
//		demo.a = 10; // ���Ҵ� �Ұ���
	}

}
