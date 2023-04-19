package study.security.securitytest.member.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import study.security.securitytest.member.domain.Member;
import study.security.securitytest.member.domain.MemberRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public Member signUp(String password) {
        String encodedPassword = passwordEncoder.encode(password);
        log.info("encodedPassword = {}", encodedPassword);

        Member member = new Member(encodedPassword);

        return memberRepository.save(member);
    }
}
