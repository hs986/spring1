package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")  //정적 파일 보다 컨트롤러가 우선
    public String home() {
        return "home";
    }
}
