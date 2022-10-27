package exam10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MemberMain3 {
	public static void main(String[] args) {
		
		// 정렬기준 익명구현 객체로 전달
		List<Member> memberList = new ArrayList<Member>();
		memberList.add(new Member(21, "홍길동"));
		memberList.add(new Member(12, "박길동"));
		memberList.add(new Member(34, "이길동"));
		memberList.add(new Member(17, "차길동"));
		
		// id 기준 오름차순 - 람다식 변환
		Collections.sort(memberList,
				(o1,o2) -> 
				 o1.getId()-o2.getId()
			
		);
		System.out.println(memberList);
		System.out.println();
		
		// id 기준 내림차순 - 람다식 변환
		Collections.sort(memberList, (a,b) -> b.getId() - a.getId());
		System.out.println(memberList);
	}

}
