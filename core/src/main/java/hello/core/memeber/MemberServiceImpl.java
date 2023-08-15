package hello.core.memeber;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

/**
 * @Author sh.kim
 * @Date 2023. 8. 12.
 * MemberService 구현체
 */
@Component
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
	
	private final MemberRepository memberRepository;
	
	@Override
	public void join(Member member) {
		memberRepository.save(member);
		
	}

	@Override
	public Member findMember(Long memberId) {
		return memberRepository.findById(memberId);
	}

}
