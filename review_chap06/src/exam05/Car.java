package exam05;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	
	public Car() {
		this("�ҳ�Ÿ","����",250); // this�� �ݵ�� ù�ٿ� �;���
	}
	
	public Car(String model) {
		this(model,"����",250);
	}

	public Car(String model, String color) {
		this(model,color,250);
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}