package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import hello.core.memeber.Grade;
import hello.core.memeber.Member;
import hello.core.memeber.MemberService;
import hello.core.memeber.MemberServiceImpl;

/**
 * @Author sh.kim
 * @Date 2023. 8. 12.
 * TDD JUnit Framework
 */
public class MemberServiceTest {

	MemberService memberService = new MemberServiceImpl();
	
	@Test
	void join() {
		// given
		Member member = new Member(1L, "memberA", Grade.VIP);
		
		// when
		memberService.join(member);
		Member findMember = memberService.findMember(1L);
		
		// then
		Assertions.assertThat(member).isEqualTo(findMember);
	}
}
