package hello.core.memeber;

/**
 * @Author sh.kim
 * @Date 2023. 8. 12.
 * MemberService 구현체
 */
public class MemberServiceImpl implements MemberService{
	
	private final MemberRepository memberRepository = new MemoryMemberRepository();
	
	@Override
	public void join(Member member) {
		memberRepository.save(member);
		
	}

	@Override
	public Member findMember(Long memberId) {
		return memberRepository.findById(memberId);
	}

}
