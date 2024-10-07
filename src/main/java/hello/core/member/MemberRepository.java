package hello.core.member;

import java.util.logging.LoggingPermission;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
