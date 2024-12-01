package wuttang.blog.repository;

import org.springframework.stereotype.Repository;
import wuttang.blog.model.Comment;

import java.util.List;

@Repository
public interface CommentRepository {
    List<Comment> findByArticleId(int articleId);
    Comment save(Comment comment);
    void deleteById(int id);
}
