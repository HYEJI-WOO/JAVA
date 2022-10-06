package section2.exam01;

public class CarDemo {
	public static void main(String[] args) {
		
		Car.isLeftGas();
		
		Car car = new Car();
		int strSize = car.run("Hello");
		System.out.println("strSize : " + strSize);
		car.stop();
		car.sound();
		
		// static 메소드 호출
		Car.isLeftGas();
		// 참조변수를 통한 호출(권장X)
		car.isLeftGas();
	}

}