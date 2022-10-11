package information;

class Parent6 {
	void print() {
		System.out.print("Parent");
	}
}

class Child6 extends Parent6 {
	Child6() {}
	Child6(String msg) {
		System.out.print(msg);
	}
	void print() {
		new Child6("hello");
		System.out.print("Child");
	}
}

public class MockExam2820 {
	public static void main(String[] args) {
		Parent6 pa = new Child6();
		pa.print();
	}

}
