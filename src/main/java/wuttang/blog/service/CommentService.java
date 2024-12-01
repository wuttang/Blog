package wuttang.blog.service;

import org.springframework.stereotype.Service;
import wuttang.blog.model.Comment;
import wuttang.blog.repository.CommentRepository;

import java.util.List;

@Service
public class CommentService implements CommentRepository {
    private CommentRepository commentRepository;

    @Override
    public List<Comment> findByArticleId(int articleId) {
        return List.of();
    }

    @Override
    public Comment save(Comment comment) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
