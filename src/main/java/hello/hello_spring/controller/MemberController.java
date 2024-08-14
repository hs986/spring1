package hello.hello_spring.controller;


import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    //private final MemberService memberService = new MemberService();

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }//오토와이어드 멤버서비스를  스프링이 컨데이너에 있는 멤버 서비스와 연결 (오류발생하는 이유 서비스에 @서비스가 안되서

    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }
}
