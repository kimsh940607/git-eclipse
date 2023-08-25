package hello.core.discount;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import hello.core.memeber.Grade;
import hello.core.memeber.Member;

/**
 * @Author sh.kim
 * @Date 2023. 8. 12.
 * 할인 정책 구현체
 */

@Component
public class FixDiscountPolicy implements DiscountPolicy{

	private int discountFixAmount = 1000; // 1000원 할인
	
	@Override
	public int discount(Member member, int price) {
		if(member.getGrade() == Grade.VIP) {
			return discountFixAmount;
		} else {
			return 0;
		}
	}
	
}
