package com.example.demo.service;

import com.example.demo.entity.User;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    @PostConstruct
    public void init() {
        users.add(new User(idGenerator.getAndIncrement(), "张三", "zhangsan@example.com", 25, null));
        users.add(new User(idGenerator.getAndIncrement(), "李四", "lisi@example.com", 30, null));
        users.add(new User(idGenerator.getAndIncrement(), "王五", "wangwu@example.com", 28, null));
    }

    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    public User findById(Long id) {
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("用户不存在: " + id));
    }

    public User save(User user) {
        user.setId(idGenerator.getAndIncrement());
        users.add(user);
        return user;
    }

    public User update(Long id, User updatedUser) {
        User existing = findById(id);
        existing.setName(updatedUser.getName());
        existing.setEmail(updatedUser.getEmail());
        existing.setAge(updatedUser.getAge());
        return existing;
    }

    public void delete(Long id) {
        users.removeIf(u -> u.getId().equals(id));
    }
}
