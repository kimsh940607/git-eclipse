package hello.core;

import hello.core.memeber.Grade;
import hello.core.memeber.Member;
import hello.core.memeber.MemberService;
import hello.core.memeber.MemberServiceImpl;

/**
 * @Author sh.kim
 * @Date 2023. 8. 12.
 * run Class
 */
public class MemberApp {
	public static void main(String[] args) {
		MemberService memberSerivce = new MemberServiceImpl();
		Member member = new Member(1L, "memberA", Grade.VIP);
		memberSerivce.join(member);
		
		Member findMember = memberSerivce.findMember(1L);
		System.out.println("New Member : " + member.getName());
		System.out.println("find Member : " + findMember.getName());
	}
}
