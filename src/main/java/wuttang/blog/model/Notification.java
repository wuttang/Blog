package wuttang.blog.model;

import java.time.LocalDateTime;

public class Notification {
    private String message;
    private LocalDateTime publishedAt;
    private User author;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {}

    public LocalDateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(LocalDateTime publishedAt) {}

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {}
}
