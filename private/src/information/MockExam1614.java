package information;

class Parent4 {
	public Parent4() {}
	String className = "Parent Class";
	public void info() {
		System.out.print(className);
	}
}

class Child4 extends Parent4 {
	public Child4() {}
	String classNAme = "Child class";
	public void info() {
		super.info();
		System.out.print(className);
	}
}

public class MockExam1614 {
	public static void main(String[] args) {
		Parent4 p = new Child4();
		p.info();
	}

}
