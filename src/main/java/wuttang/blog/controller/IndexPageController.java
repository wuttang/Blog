package wuttang.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import wuttang.blog.service.ArticleService;
import wuttang.blog.service.NotificationService;

@Controller
public class IndexPageController {
    private ArticleService articleService;
    private NotificationService notificationService;

    @GetMapping("/main")
    public String getIndexPage() {
        return "main";
    }
    public void addLastArticleToModel(Model model) {}

    public void addNotificationsToModel(Model model) {}
}
