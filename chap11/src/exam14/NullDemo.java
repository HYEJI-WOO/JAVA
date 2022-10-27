package exam14;

import java.util.Objects;

public class NullDemo {
	public static void main(String[] args) {
		String str1 = null;
		String str2 = "홍길동";
		nullCheck(str1);
		nullCheck(str2);
	
	}
	private static void nullCheck(String str) {
		if(!Objects.nonNull(str)) { // str==null
			System.out.println("str은 null 입니당^^");
			return;
		}
		System.out.println("str은 null 아닙니당^^");
	}

}
