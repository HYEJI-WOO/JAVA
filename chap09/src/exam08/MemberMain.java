package exam08;

public class MemberMain {
	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberService memberService = new MemberService(memberDao);
		Member[] members = memberService.memberList();
		System.out.println(members);
	}

}
