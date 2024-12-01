package wuttang.blog.service;

import org.springframework.stereotype.Service;
import wuttang.blog.model.Article;
import wuttang.blog.repository.ArticleRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService implements ArticleRepository {
    private ArticleRepository articleRepository;

    @Override
    public Article findLastArticle() {
        return null;
    }

    public Article save(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public List<Article> findAll() {
        return List.of();
    }

    @Override
    public Optional<Article> findById(int id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(int id) {}
}
