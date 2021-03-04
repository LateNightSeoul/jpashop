package jpashop.jpashop.api;

import jpashop.jpashop.domain.Member;
import jpashop.jpashop.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class MemberApiController {

    private final MemberService memberService;

    @PostMapping
    public CreateMemberResponse saveMemberV1(@RequestBody @Valid Member member) {

    }

    static class CreateMemberResponse {
        private Long id;
    }
}
