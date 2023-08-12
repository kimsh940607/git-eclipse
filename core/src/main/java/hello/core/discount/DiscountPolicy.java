package hello.core.discount;

import hello.core.memeber.Member;

/**
 * @Author sh.kim
 * @Date 2023. 8. 12.
 * 할인 정책 룰
 */
public interface DiscountPolicy {
	/* @return 할인 대상 금액*/
	int discount(Member member, int price);
}
