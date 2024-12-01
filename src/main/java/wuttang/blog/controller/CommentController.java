package wuttang.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import wuttang.blog.model.Comment;
import wuttang.blog.service.ArticleService;
import wuttang.blog.service.CommentService;

@Controller
public class CommentController {
    private CommentService commentService;
    private ArticleService articleService;


    public String addComment(int articleId, Comment comment) {
        return "";
    }

    public String deleteComment(int articleId, int commentId) {
        return "";
    }

    public String getCommentsByArticleId(int articleId) {
        return "";
    }
}
