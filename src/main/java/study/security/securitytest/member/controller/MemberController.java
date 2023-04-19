package study.security.securitytest.member.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.security.securitytest.member.domain.Member;
import study.security.securitytest.member.service.MemberService;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/api/member")
    public Member signUp(@RequestParam String password) {
        log.info("input password  = {}", password);
        return memberService.signUp(password);
    }
}
