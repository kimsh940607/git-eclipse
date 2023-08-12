package hello.core.discount;

import hello.core.memeber.Grade;
import hello.core.memeber.Member;

/**
 * @Author sh.kim
 * @Date 2023. 8. 12.
 * 할인 율 정잭 변경 fix -> rate
 */
public class RateDiscountPolicy implements DiscountPolicy{

	private int discountPercent = 10;

	@Override
	public int discount(Member member, int price) {

		if(member.getGrade() == Grade.VIP) {
			return price * discountPercent / 100;
		} else {
			return 0;
		}
	}
	
}
