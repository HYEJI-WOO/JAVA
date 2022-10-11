package exam04;

public class PeopleDemo {
	public static void main(String[] args) {
		// 자식객체를 생성하면 부모객체도 생성된다.
		// 자식(서브,하위) 클래스 생성자 호출 -> 부모=조상(슈퍼,상위) 클래스 생성자 호출
//		Student st = new Student();
//		Student st = new Student("박길동", "5678");
		Student st = new Student("고길동", "4513", 10);
		st.printInfo(); // 오버라이딩
	}

}
