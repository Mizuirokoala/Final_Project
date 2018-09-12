package pl.mizuirokoala.service;


import pl.mizuirokoala.role.User;

public interface UserService {
    User findByUserName(String name);

    void saveUser(User user);
}
