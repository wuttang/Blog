package wuttang.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import wuttang.blog.model.User;
import wuttang.blog.service.UserService;

@Controller
public class GlobalController {
    private UserService userService;

    public void AddUserToModel(Model model, User user) {}
}
