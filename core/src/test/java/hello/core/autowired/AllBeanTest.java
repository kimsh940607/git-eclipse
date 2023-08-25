package hello.core.autowired;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hello.core.AutoAppConfig;
import hello.core.discount.DiscountPolicy;
import hello.core.memeber.Grade;
import hello.core.memeber.Member;

/**
 * @Author sh.kim
 * @Date 2023. 8. 26.
 * List, Map 모든 Bean 등록 TDD
 */
public class AllBeanTest {

	@Test
	void findAllBena() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class, DiscountService.class);
		DiscountService discountService = ac.getBean(DiscountService.class);
		Member member = new Member(1L, "userA", Grade.VIP);
		int discountPrice = discountService.d
		
	}
	
	static class DiscountService {
		private final Map<String, DiscountPolicy> policyMap;
		private final List<DiscountPolicy> policy;
		
		@Autowired
		public DiscountService(Map<String, DiscountPolicy> policyMap, List<DiscountPolicy> policy) {
			this.policyMap = policyMap;
			this.policy = policy;
			
			System.out.println("policyMap = " + policyMap);
			System.out.println("policy = " + policy);
		}
	}
}
