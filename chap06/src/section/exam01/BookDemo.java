package section.exam01;

public class BookDemo {
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "�̰��� �ڹٴ�";
		book1.author = "�ſ��";
		book1.number = 500;
		book1.printInfo();
		
		book2.title = "�̰��� ����Ŭ�̴�";
		book2.author = "���糲";
		book2.number = 600;
		book2.printInfo();
		
		Book book3 = new Book();
		book3.setInfo("����ó����� �Ǳ�", "������", 400);
		book3.printInfo();
		
	}
}
