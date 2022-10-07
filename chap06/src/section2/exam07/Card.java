package section2.exam07;

public class Card {
	
	int cardNumber; // 카드 숫자(instance)
	static int cardWidth; // 카드 가로길이(static)
	static int cardHeight; // 카드 세로길이(static)
	// 카드의 가로, 세로길이는 모두 같이 때문에 공유변수(static) 사용
	
	public Card() {
		// 정적, 비정적 멤버 모두 사용 가능
		System.out.println(cardWidth); // 정적 멤버 사용
		this.cardNumber = 8; // 비정적 멤버 사용
	}
	
	static {
		// 정적 멤버 사용 가능
		cardWidth = 90;
		cardHeight = 55;
		// 비정적 멤버 사용 불가능
//		carNumber = 10;
//		getCardMessage();
	}
	
	// static 메소드
	static void infoCardSize() {
		// 정적 멤버 사용 가능
		System.out.println(cardWidth);
		System.out.println(cardHeight);
		getMessage();
		// 비정적 멤버 사용 불가능
//		cardNumber = 10;
//		getCardNumber();
	}
	
	static void getMessage() {
		System.out.println("Hello");
	}
	
	// instance 메소드
	int getCardNumber() {
		// 정적 , 비정적 멤버 모두 사용 가능
		getMessage(); // 정적 메소드
		cardNumber = 100; // 인스턴스 필드
		cardWidth = 80; // 정적 필드
		cardHeight = 40; // 정적 필드
		return this.cardNumber;
	}
	
	
	public static void main(String[] args) {
		infoCardSize();
//		Card card = new Card();
//		int result = card.getCardNumber();
//		System.out.println(result);
	}

}

//<정적 멤버 (static)>
//정적 필드
//정적 메소드
//객체생성 유무 관계없음(언제나 사용가능)

//<비정적 멤버 (instance)>
//생성자
//인스턴스 필드
//인스턴스 메소드
//객체생성 후에 사용가능(정적 블록에서 사용 x)

//<정적 블록> - 객체생성 보장x
//스태틱 블록
//스태틱 메소드

//<비정적 블록> - 객체생성 보장o
//생성자
//인스턴스 메소드