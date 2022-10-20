package exam12;

import exam12.test01.DemoA;

public class DemoMain {
	public static void main(String[] args) {
		// 동일 패키지 내에서
		DemoC dc = new DemoC();
		System.out.println(dc.a); // public
		System.out.println(dc.b); // protected 
		System.out.println(dc.c); // default
//		System.out.println(dc.d); // private
		
		// 다른 패키지
		DemoA da = new DemoA();
		System.out.println(da.a); // public 
//		System.out.println(da.b); // protected 접근불가
//		System.out.println(da.c); // default 접근불가
//		System.out.println(da.d); // private 접근불가
	}

}
