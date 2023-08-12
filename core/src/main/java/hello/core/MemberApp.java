package hello.core;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
//		AppConfig appConfig = new AppConfig();
//		MemberService memberSerivce = appConfig.memberService();
		
		
		/* AppConfig가 annotation(@Configuration, @Bean) 기반으로 설정 되어 있기 때문에 AnnotaionConfiguration으로 지정 */
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		/* @Bean의 경우 기본적으로 Method 이름으로 Bean 이름을 설정한다. */
		MemberService memberSerivce = applicationContext.getBean("memberService", MemberService.class);
		
		Member member = new Member(1L, "memberA", Grade.VIP);
		memberSerivce.join(member);
		
		Member findMember = memberSerivce.findMember(1L);
		System.out.println("New Member : " + member.getName());
		System.out.println("find Member : " + findMember.getName());
	}
}
