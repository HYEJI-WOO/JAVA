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
		System.out.println("力格 : " + title);
		System.out.println("历磊 : " + author);
		System.out.println("其捞瘤 荐 : " + number);
		System.out.println();

	}
}
