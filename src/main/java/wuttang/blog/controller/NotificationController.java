package wuttang.blog.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import wuttang.blog.model.User;

@Controller
public class NotificationController {
    @GetMapping("/create_notification")
    public String create_notification(User user, HttpSession session) {
        Boolean hasVisitedAuthPages = (Boolean) session.getAttribute("visitedAuth");

        if (hasVisitedAuthPages != null && hasVisitedAuthPages) {
            return "create_notification";
        } else {
            return "redirect:/login";
        }
    }
}
