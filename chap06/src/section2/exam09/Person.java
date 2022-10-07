package section2.exam09;

public class Person {
	final String nation; 
	final String ssn;
	String name;

	public Person() {
		nation = "대한민국"; // 생성자에서 초기화
		ssn = "123456789"; 
	}
	
	// final 필드 : 생성자의 매개값으로 초기화 가능
	public Person(String nation, String ssn) {
		this.nation = nation;
		this.ssn = ssn;
	}
	
}
