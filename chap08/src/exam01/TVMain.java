package exam01;

public class TVMain {
	public static void main(String[] args) {
//		Television tv = new Television();
		// �������̽�(RemoteControl) Ÿ���� 
		// ������ü(Television)�� ����Ÿ���� �� �� �ִ�.
		RemoteControl tv = new Television();
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(100);
		tv.setVolume(-10);
		tv.setVolume(5);
		tv.setMute(false); // ����Ʈ�޼ҵ�
		System.out.println();
		
		RemoteControl audio = new Audio();
		audio.turnOn();
		audio.turnOff();
		audio.setVolume(100);
		audio.setVolume(-10);
		audio.setVolume(5);
		audio.setMute(false); // ����Ʈ�޼ҵ�
	}

}
