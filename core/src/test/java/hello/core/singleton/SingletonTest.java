package hello.core.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import hello.core.AppConfig;
import hello.core.memeber.MemberService;


/**
 * @Author sh.kim
 * @Date 2023. 8. 14.
 * SigleTon TDD 
 */
public class SingletonTest {

	@Test
	@DisplayName("스프링 사용하지 않고 DI 호출")
	void pureCOntainer() {
		AppConfig appConfig = new AppConfig();
		MemberService memberService1 = appConfig.memberService();
		
		MemberService memberService2 = appConfig.memberService();
		
		
		assertThat(memberService1).isNotSameAs(memberService2);
	}
	
	@Test
	@DisplayName("싱글톤 패턴을 사용한 객체 사용")
	void singletonServiceTest() {
		SingletonService singletonService1 = SingletonService.getInstance();
		SingletonService singletonService2 = SingletonService.getInstance();
		assertThat(singletonService1).isSameAs(singletonService2);
	}
}
