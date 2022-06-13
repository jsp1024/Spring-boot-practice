package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi") // GetMapping을 이용해서 url을 매핑 해준다.
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "재만");
        return "greetings"; // templates/greetings.mustache => 브라우저로 전송함
    }

    @GetMapping("/bye")
    public String seeYouAgain(Model model) {
        model.addAttribute("nickname", "JM");
        return "goodbye";
    }
}
