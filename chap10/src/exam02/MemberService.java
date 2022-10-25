package exam02;

public class MemberService {
	
	private MemberDao memberDao;

	// 생성자주입
	// 세터주입
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public void memberList() {
		try {
			memberDao.selectAll();
		} catch (Exception e) {
			System.out.println("DAO객체가 할당되지 않았습니다.");
		}
	}
	
	

}
