package hello.core.discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import hello.core.memeber.Grade;
import hello.core.memeber.Member;

import static org.assertj.core.api.Assertions.*;

public class RateDiscountPolicyTest {

	RateDiscountPolicy discountPolicy = new RateDiscountPolicy();
	
	@Test
	void vip_o() {
		// given
		Member member = new Member(1L, "memberA", Grade.VIP);
		
		// when
		int discount = discountPolicy.discount(member, 10000);
		// then
		assertThat(discount).isEqualTo(1000);
	}
	
	@Test
	void vip_x() {
		// given
		Member member = new Member(2L, "memberA", Grade.BASIC);
		
		// when
		int discount = discountPolicy.discount(member, 10000);
		// then
		assertThat(discount).isEqualTo(1000);
	}
}
