package spring5_Component.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberInfoPrinter {
	@Autowired
	private MemberDao memDao;
	private MemberPrinter printer;

	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if (member == null) {
			System.out.println("데이터 없음\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}


}
