package exam01;

public class Car {
	// hasA
	Tire[] tires = {
			new Tire("앞왼쪽", 6),
			new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽", 3),
			new Tire("뒤오른쪽", 4),			
	};
	
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
