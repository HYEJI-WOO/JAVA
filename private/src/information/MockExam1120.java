package information;

class Parent{
	int a = 0;
	Parent() {
		a++;
		System.out.print(a);
	}
	void run() {
		System.out.println("������?");
	}
	void aa() {
		System.out.println("aa");
	}
}

class Child extends Parent{
	int b = 0;
	Child(int a) {
		this.b = a;
		System.out.print(a++);
	}
	void run() {
		System.out.println("�Ƶ��Դϴ�.");
	}
	void bb() {
		System.out.println("bb");
	}
}

public class MockExam1120 {
	public static void main(String[] args) {
		Parent parent = new Child(1);
		parent.aa();
		parent.run();
		 
	}

}
