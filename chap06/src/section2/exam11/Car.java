package section2.exam11;

public class Car {
	private int speed;
	private boolean stop;
	
	public Car(int speed, boolean stop) {
		this.speed = speed;
		this.stop = stop;
	}
	
	void run() {
		System.out.println("~~~~~~run~~~~~~");
	}
	
	// getter ���� �޼ҵ�
	// �̸� �ʵ��� ù���� �빮�ڷ� ����
	// ���λ�� get�� ���� getSpeed()
	// ���������� : public
	public int getSpeed() {
		return speed;
	}
	// booleanŸ���� ��� ���ξ� is�� �����
	// getStop()���� ����ص� ��
	public boolean isStop() {
		return stop;
	}
	
	// setter ���� �޼ҵ�
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}

}
