package section.exam05;

public class Board {
	long id;
	String title;
	String content;
	String writer;
	
	// ������ �ڵ��ϼ� ����Ű
	// ���1. shift + alt + s : Generate Constructor Using Fields ����
	// ���2. Source : Generate Constructor Using Fields ����

	public Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
}
