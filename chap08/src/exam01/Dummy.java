package exam01;

public abstract class Dummy implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("���� ��");
	}

	@Override
	public void turnOff() {
		System.out.println("���� ��");
	}
	
	// setVolume(int volume) �޼ҵ带 �������� �ʾҴ�.
	// �� ��� �� Ŭ������ �߻�Ŭ������ �ȴ�.


}
