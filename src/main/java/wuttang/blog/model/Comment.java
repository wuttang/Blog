package wuttang.blog.model;

import java.time.LocalDateTime;

public class Comment {
    private User author;
    private LocalDateTime postedAt;
    private String content;
    private int id;
    private Article article;

    public User getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getPostedAt() {
        return postedAt;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public void setPostedAt(LocalDateTime postedAt) {
    }

    public void setContent(String content) {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setArticle(Article article){}
}
