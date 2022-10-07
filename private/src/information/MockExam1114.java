package information;

interface Animal{
	public void show();
}
class Dog implements Animal{
	public void show() {
		System.out.println("dog");
	}
}
public class MockExam1114 {
	public static void main(String[] args) {
		Animal d = new Dog();
		d.show();
	}

}