package information;

class Parent3{
	String name = "Parent";
	public Parent3() {
		System.out.print(this.name);
	}
}

class Child3 extends Parent3 {
	public Child3(String name) {
		System.out.print(this.name);
	}
}

public class MockExam1513 {
	public static void main(String[] args) {
		Child3 c = new Child3("Soojebi");
	}

}
