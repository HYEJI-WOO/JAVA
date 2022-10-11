package information;

class Parent2 {
	String className = "Parent";
	public void info() {
		System.out.print(className);
	}
}

class Child2 extends Parent2 {
	String className = "Child";
	public void info() {
		super.info();
		System.out.print(className);
	}
}

public class MockExam1414 {
	public static void main(String[] args) {
		Parent2 p = new Child2();
		p.info();
	}
}