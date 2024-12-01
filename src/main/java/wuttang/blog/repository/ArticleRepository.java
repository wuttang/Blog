package wuttang.blog.repository;

import org.springframework.stereotype.Repository;
import wuttang.blog.model.Article;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArticleRepository {
    Article findLastArticle();
    List<Article> findAll();
    Optional<Article> findById(int id);
    Article save(Article article);
    void deleteById(int id);
}
