package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.memeber.MemberRepository;
import hello.core.memeber.MemberService;
import hello.core.memeber.MemberServiceImpl;
import hello.core.memeber.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

/**
 * @Author sh.kim
 * @Date 2023. 8. 12.
 * 관심사 분리 (DI 의존관계 주입) 
 */
public class AppConfig {

	public MemberService memberService() {
		return new MemberServiceImpl(memberRepository());
	}
	
	public MemberRepository memberRepository() {
		return new MemoryMemberRepository();
	}
	
	public OrderService orderService() {
		return new OrderServiceImpl(memberRepository(), discountPolicy());
	}
	
	public DiscountPolicy discountPolicy() {
		return new FixDiscountPolicy();
	}
}
