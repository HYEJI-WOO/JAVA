package exam07;

public class AA { // AA Ŭ���� : �ܺ�
	int aa = 10; // �ܺ� Ŭ������ �ν��Ͻ� �ʵ�
	static int bb = 10; // �ܺ� Ŭ������ ���� �ʵ�
	
	void methodA() {
		System.out.println("�ܺ�Ŭ������ �ν��Ͻ� �޼ҵ�");
	}
	static void methodAA() {
		System.out.println("�ܺ�Ŭ������ ���� �޼ҵ�");
	}
	
	class BB { // BB Ŭ���� : ���� �ν��Ͻ� Ŭ����
		int aa = 1000;
		void methodB() {
//			int aa = 100;
			System.out.println(aa); // �ܺ� Ŭ������ �ν��Ͻ� �ʵ�� ���� ����
			System.out.println(bb); // �ܺ� Ŭ������ ���� �ʵ� ���� ����
			methodA(); // �ܺ� Ŭ������ �ν��Ͻ� �޼ҵ� ���ٰ���
			methodAA(); // �ܺ� Ŭ������ ���� �޼ҵ� ���ٰ���
		}
	}
	
	static class CC { // CC Ŭ���� : ���� ���� Ŭ����
		void methodC() {
//			System.out.println(aa); // �ܺ� Ŭ������ �ν��Ͻ� �ʵ�� ���� �Ұ�
			System.out.println(bb); // �ܺ� Ŭ������ ���� �ʵ� ���� ����
//			methodA(); // �ܺ� Ŭ������ �ν��Ͻ� �޼ҵ� ���� �Ұ�
			methodAA(); // �ܺ� Ŭ������ ���� �޼ҵ� ���ٰ���
		}
	
	}
}
