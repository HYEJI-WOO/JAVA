package exam04;

import java.util.List;

public interface MemberDao {
	
	List<MemberVO> memberList();
	
	MemberVO findById(int id);

}
