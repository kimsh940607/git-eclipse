package hello.core.memeber;

/**
 * @Author sh.kim
 * @Date 2023. 8. 12.
 * Member Service
 */
public interface MemberService {

	void join (Member member);
	
	Member findMember(Long memberId);
}
