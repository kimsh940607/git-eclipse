package hello.core.order;

/**
 * @Author sh.kim
 * @Date 2023. 8. 12.
 * Order InterFace
 */
public interface OrderService {
	Order createOrder(Long memberId, String itemName, int itemPrice);
	
}
