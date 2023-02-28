package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public User getUserById(long id);

    public void saveUser(User user);

    public void deleteUser(long id);

    public void updateUser(long id, User updatedUser);
}
