package hello.core.memeber;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

/**
 * @Author sh.kim
 * @Date 2023. 8. 12.
 * Member Implements
 */
@Component
public class MemoryMemberRepository implements MemberRepository{

	private static Map<Long, Member> store = new HashMap<>();
	
	@Override
	public void save(Member member) {
		store.put(member.getId(), member);
	}

	@Override
	public Member findById(Long memberId) {
		return store.get(memberId);
	}
	
}
