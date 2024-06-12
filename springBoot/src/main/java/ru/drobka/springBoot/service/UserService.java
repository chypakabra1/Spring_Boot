package ru.drobka.springBoot.service;

import ru.drobka.springBoot.model.User;

import java.util.List;


public interface UserService {
    List<User> index();

    User show(int id);

    void save(User user);

    void update(User user, int id);

    void delete(int id);
}
