package wuttang.blog.repository;

import org.springframework.stereotype.Repository;
import wuttang.blog.model.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository {
    Optional<User> findByEmail(String email);
    User save(User user);
    List<User> findAll();
    void deleteById(Long id);
    User blockById(Long id);
    User edit(User user);
}
