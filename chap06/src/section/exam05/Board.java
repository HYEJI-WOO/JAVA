package section.exam05;

public class Board {
	long id;
	String title;
	String content;
	String writer;
	
	// 생성자 자동완성 단축키
	// 방법1. shift + alt + s : Generate Constructor Using Fields 선택
	// 방법2. Source : Generate Constructor Using Fields 선택

	public Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
}
