package information;

	class Car {
		String model;
		String color;
		int yyyy;
		Car() {
			this.model = "�¿���";
			this.color = "����";
			this.yyyy = 2020;
			System.out.print("model : " + model);
		}
		Car(String model, String color, int yyyy) {
			this.model = model;
			this.color = color;
			this.yyyy = yyyy;
			System.out.print("model : " + model);
		}
	}
	
	public class MockExam1111 {
		public static void main(String[] args) {
			int yyyy = 2020;
			Car c = new Car("SUV", "���", yyyy++);
			System.out.print(", year : " + c.yyyy);
			
		}
	

}
