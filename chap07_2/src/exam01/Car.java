package exam01;

public class Car {
	// hasA
	Tire[] tires; 
	
	public Car(Tire[] tires) {
		this.tires = tires;
	}
	
	int run() {
		System.out.println("자동차가 달립니다.");
		for (int i = 0; i < tires.length; i++) {
			if(tires[i].roll() == false) { // 펑크가 난경우
				stop();
				return i+1; // 펑크난 타이어 번호 변환
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}

}
