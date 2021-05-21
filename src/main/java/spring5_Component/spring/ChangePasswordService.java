package spring5_Component.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//암호 변경 기능
@Service
public class ChangePasswordService {
	@Autowired
	private MemberDao memberDao;
	
	//암호 변경
	public void changePassword(String email, String oldPwd, String newPwd) {
		Member member = memberDao.selectByEmail(email);
		//만약 멤버가 null이면 멤버못찾음 예외
		if (member == null)
			throw new MemberNotFoundException();
		//찾으면 changePassword실행
		member.changePassword(oldPwd, newPwd);
		
		memberDao.update(member);
	}


}
