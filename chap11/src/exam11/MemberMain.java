package exam11;

import java.util.Objects;

public class MemberMain {
	public static void main(String[] args) {
		Member member1 = new Member("È«±æµ¿");
		Member member2 = new Member("È«±æµ¿");
		Member member3 = new Member("±è±æµ¿");
		Member member4 = null;
		Member member5 = null;
		System.out.println(member1.equals(member2)); // true
		System.out.println(member2.equals(member3)); // false
		
		System.out.println(Objects.equals(member1, member2)); // true
		
//		member4.equals(member1); // NullPointerException

		// null°´Ã¼¿Í nullÀÌ ¾Æ´Ñ °´Ã¼ ºñ±³ : false
		System.out.println(Objects.equals(member4, member1)); // false
		
		// µÎ °´Ã¼ ¸ðµÎ nullÀÎ °æ¿ì true ¹ÝÈ¯
		System.out.println(Objects.equals(member4, member5)); // true
	}

}
