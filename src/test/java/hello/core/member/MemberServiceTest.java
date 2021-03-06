package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        memberService = new AppConfig().memberService();
    }


    @Test
    void join() {
        long id = 1L;
        // given
        Member member = new Member(id, "memberA", Grade.VIP);
        // when
        memberService.join(member);
        Member findMember = memberService.findMember(id);
        // then org.assertj.core.api
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
