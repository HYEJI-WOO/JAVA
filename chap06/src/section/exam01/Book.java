package section.exam01;

public class Book {
	String title;
	String author;
	int number;
	
	void setInfo(String t, String a, int n) {
		title = t;
		author = a;
		number = n;
	}
	
	void printInfo() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("페이지 수 : " + number);
		System.out.println();

	}
}
