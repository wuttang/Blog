package wuttang.blog.service;

import org.springframework.stereotype.Service;
import wuttang.blog.model.Notification;
import wuttang.blog.repository.NotificationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationService implements NotificationRepository {
    private NotificationRepository notificationRepository;

    public List<Notification> getNotifications() {
        return notificationRepository.findAll();
    }

    @Override
    public List<Notification> findAll() {
        return List.of();
    }

    @Override
    public Optional<Notification> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Notification save(Notification notification) {
        return notificationRepository.save(notification);
    }

    @Override
    public void deleteById(Long id) {
        notificationRepository.deleteById(id);
    }
}
