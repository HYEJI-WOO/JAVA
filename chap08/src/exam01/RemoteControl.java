package exam01;

public interface RemoteControl {
	// �������̽� �ʵ�
	// ����� ������ �� �ִ�. �ν��Ͻ� �ʵ� ���� �Ұ���, ����ƽ �ʵ� ���� �Ұ��� 
	// public static final ������ �� ������
	// �����ص� public static final ������.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// �߻�޼ҵ�(�����޼ҵ�X, �ν��Ͻ��޼ҵ�O)
	// public abstract�� ������ ����
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// �����޼ҵ� ����, public�� ������ ����
	static void changeBattery() {
		System.out.println("������ ��ü");
	}
	
	// ����Ʈ �޼ҵ�(�����޼ҵ�X, �ν��Ͻ��޼ҵ�O)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("����ó��");
		} else {
			System.out.println("��������");
		}
	}
}