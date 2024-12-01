package wuttang.blog.model;

import java.util.List;

public class Article {
    private int id;
    private String preview;
    private String content;
    private List<Comment> comments;
    private String title;
    private User author;

    public int getId() {
        return id;
    }

    public void setId(int id) {}

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {}

    public String getContent() {
        return content;
    }

    public void setContent(String content) {}

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {}

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {}
}
