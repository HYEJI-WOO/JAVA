package information;

class Parent5 {
	
//	public Parent5() {}
	
	int compute(int num) {
		if(num <= 1) {
			return 1;
		}
		return num*compute(num-1);
	}
}

class Child5 extends Parent5 {
//	public Child5() {}
	
	int compute(int num) {
		if(num <= 1) {
			return 1;
		}
		return num*compute(num-2);
	}
}

public class MockExam2412 {
	public static void main(String[] args) {
		Parent5 obj = new Child5();
		System.out.println(obj.compute(4));
	}

}
