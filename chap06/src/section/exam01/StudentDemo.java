package section.exam01;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student(); // s1이 참조하는 Student객체 생성
		Student s2 = new Student(); // s2가 참조하는 Student객체 생성
		System.out.println(s1==s2); // 참조값(주소값) 비교
		System.out.println("s1의 참조값 : " + s1); // 참조값 출력
		System.out.println("s2의 참조값 : " + s2); // 참조값 출력
		
		s1.name = "우혜지";
		s1.age = 24;
		System.out.println(s1.name);
		System.out.println(s2.name);
		
		
	}

}
