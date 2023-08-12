package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.memeber.Member;
import hello.core.memeber.MemberRepository;
import hello.core.memeber.MemoryMemberRepository;

/**
 * @Author sh.kim
 * @Date 2023. 8. 12.
 * Order 구현체
 */
public class OrderServiceImpl implements OrderService{

	private final MemberRepository memberRepository = new MemoryMemberRepository();
	private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
	
	@Override
	public Order createOrder(Long memberId, String itemName, int itemPrice) {
		Member member = memberRepository.findById(memberId);
		int discountPrice = discountPolicy.discount(member, itemPrice);
		
		return new Order(memberId, itemName, itemPrice, discountPrice);
	}
	
	
}
