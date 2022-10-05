package section.exam01;

public class BookDemo {
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "이것이 자바다";
		book1.author = "신용권";
		book1.number = 500;
		book1.printInfo();
		
		book2.title = "이것이 오라클이다";
		book2.author = "우재남";
		book2.number = 600;
		book2.printInfo();
		
		Book book3 = new Book();
		book3.setInfo("정보처리기사 실기", "수제비", 400);
		book3.printInfo();
		
	}
}
