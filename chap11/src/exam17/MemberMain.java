package exam17;

public class MemberMain {
	public static void main(String[] args) throws ClassNotFoundException {
		// Member클래스의 Class객체 정보 얻기
		// 객체를 생성하지 않고 클래스 정보 얻기
		// 스태틱 메소드 사용 class.forName()
		Class<?> clazz = Class.forName("exam17.Member");
		System.out.println("클래스 이름 : " + clazz.getName());
		System.out.println("패키지를 제외한 클래스 이름 : " + clazz.getSimpleName());
		System.out.println("패키지 이름 " + clazz.getPackage().getName());
		System.out.println("패키지 이름 " + clazz.getPackageName());
		System.out.println("=============================");
		
		// 객체 생성 후 클래스 정보 얻기
		// 인스턴스 메소드 사용 getClass()
		Member member = new Member();
		Class<?> clazz2 = member.getClass();
		System.out.println("클래스 이름 : " + clazz2.getName());
		System.out.println("패키지를 제외한 클래스 이름 : " + clazz2.getSimpleName());
		System.out.println("패키지 이름 " + clazz2.getPackage().getName());
		System.out.println("패키지 이름 " + clazz2.getPackageName());
		
	}

}
