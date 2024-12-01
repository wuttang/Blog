package wuttang.blog.repository;

import org.springframework.stereotype.Repository;
import wuttang.blog.model.Notification;

import java.util.List;
import java.util.Optional;

@Repository
public interface NotificationRepository {
    List<Notification> findAll();
    Optional<Notification> findById(Long id);
    Notification save(Notification notification);
    void deleteById(Long id);
}
