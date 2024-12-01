package wuttang.blog.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import wuttang.blog.model.User;

@Controller
public class UserController {

    @GetMapping("/user_profile")
    public String viewUser(User user) {
        return "user_profile";
    }

    @GetMapping("/login")
    public String login(User user, HttpSession session) {
        session.setAttribute("visitedAuth", true);

        return "login";
    }

    @GetMapping("/create_account")
    public String register(User user, HttpSession session) {
        return "create_account";
    }
}
