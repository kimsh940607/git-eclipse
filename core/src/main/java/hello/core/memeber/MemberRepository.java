package hello.core.memeber;

/**
 * @Author user
 * @Date 2023. 8. 12.
 * Member Interface
 */
public interface MemberRepository {
	
	void save(Member member);
	
	Member findById(Long memberId);
}
