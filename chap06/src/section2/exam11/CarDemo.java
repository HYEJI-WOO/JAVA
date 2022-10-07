package section2.exam11;

public class CarDemo {
	public static void main(String[] args) {
		Car car = new Car(100, false);
		car.run();
//		car.speed = 200;
		car.setSpeed(200);
//		car.stop = true;
		car.setStop(true);
		System.out.println(car.getSpeed());
		System.out.println(car.isStop());
	}

}
