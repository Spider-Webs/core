package hello.core.member;
//회원서비스 인터페이스
public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);

}
