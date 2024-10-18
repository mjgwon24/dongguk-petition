package developer.dongguk_petition.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @GetMapping("/login")
    public String login() {
        return "html/auth/login.html";
    }

    @GetMapping("/signup")
    public String signup() {
        return "html/auth/signup.html";
    }
}
