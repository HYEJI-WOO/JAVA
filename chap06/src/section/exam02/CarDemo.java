package section.exam02;

public class CarDemo {
	public static void main(String[] args) {
		Car car = new Car(); // Car() 생성자 메소드
		car.setInfo("현대자동차", "소나타", 200);
		
		Car car2 = new Car("르노삼성", "SM3", 250);
		car2.printInfo();
		
	}

}
