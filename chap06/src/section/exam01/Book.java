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
		System.out.println("���� : " + title);
		System.out.println("���� : " + author);
		System.out.println("������ �� : " + number);
		System.out.println();

	}
}
