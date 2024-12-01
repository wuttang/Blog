package wuttang.blog.service;

import org.springframework.stereotype.Service;
import wuttang.blog.model.User;
import wuttang.blog.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserRepository {
    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(Long id) {}

    @Override
    public User blockById(Long id) {
        return null;
    }

    @Override
    public User edit(User user) {
        return null;
    }
}
