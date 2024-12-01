package wuttang.blog.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import wuttang.blog.model.Article;
import wuttang.blog.model.User;
import jakarta.servlet.http.HttpSession;
import wuttang.blog.service.ArticleService;
import wuttang.blog.service.UserService;

@Controller
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;
    private final UserService userService;

    @GetMapping("/")
    public String getArticles(Model model) {
        return "articles";
    }

    @GetMapping("/view_article")
    public String viewArticle(Integer id, Model model) {
        return "view_article";
    }

    public String saveArticle(Article article, User user) {
        return "";
    }

    @GetMapping("/edit_article")
    public String editArticle(Integer id, Article article, HttpSession session) {
        Boolean hasVisitedAuthPages = (Boolean) session.getAttribute("visitedAuth");

        if (hasVisitedAuthPages != null && hasVisitedAuthPages) {
            return "edit_article";
        } else {
            return "redirect:/login";
        }
    }

    @GetMapping("/create_article")
    public String createArticle(Article article, User user, HttpSession session) {
        Boolean hasVisitedAuthPages = (Boolean) session.getAttribute("visitedAuth");

        if (hasVisitedAuthPages != null && hasVisitedAuthPages) {
            return "create_article";
        } else {
            return "redirect:/login";
        }
    }

    public String deleteArticle(Integer id) {
        return "";
    }
}
