package section2.exam01;

public class Calculator {
	
	// private�� ���� �ܺλ���ڰ� ������� true, false�� �ٲ� �� ������ ���
	private boolean powerState;
	
	void powerOn() {
		System.out.println("������ �մϴ�");
		/* this.�� �ٿ��� �ǰ� �Ⱥٿ��� �ǰ�*/
		powerState = true;
	}
	
	void powerOff() { 
		System.out.println("������ ���ϴ�");
		powerState = false;
	}
	
	int plus(int x, int y) {
		if(powerState) { // ������ �����ִٸ�
		//(!powerState) ������ �����ִٸ�
			return x + y;			
			} 
		System.out.println("������ Ű�� ����ϼ���");
		return 0;
	}
	
	double divide(int x, int y) {
		if(powerState) {
			return (double)x/y;
			}
		System.out.println("������ Ű�� ����ϼ���");
		return 0; 
	}
}