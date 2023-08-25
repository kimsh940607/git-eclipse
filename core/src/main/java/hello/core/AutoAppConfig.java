package hello.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import hello.core.memeber.MemberRepository;
import hello.core.memeber.MemoryMemberRepository;

/**
 * @Author sh.kim
 * @Date 2023. 8. 14.
 * Component Scan Config file
 */
@Configuration
@ComponentScan(
			/*기존의 AppConfig.java에 Configuration annotation을 scan 대상에서 제외 시키기 위함*/
			excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
		)
public class AutoAppConfig {
	/*
	 * @Bean(name = "memoryMemberRepository") public MemberRepository
	 * memberRepository() { return new MemoryMemberRepository(); }
	 */
}
