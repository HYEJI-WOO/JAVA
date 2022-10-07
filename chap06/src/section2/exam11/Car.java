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
	
	// getter 게터 메소드
	// 이름 필드의 첫글자 대문자로 변경
	// 접두사로 get을 붙임 getSpeed()
	// 접근제한자 : public
	public int getSpeed() {
		return speed;
	}
	// boolean타입인 경우 접두어 is를 사용함
	// getStop()으로 사용해도 됨
	public boolean isStop() {
		return stop;
	}
	
	// setter 세터 메소드
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}

}
