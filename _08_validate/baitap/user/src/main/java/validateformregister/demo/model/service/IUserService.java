package validateformregister.demo.model.service;

import validateformregister.demo.model.entity.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    void save(User user);

    User findByid(int id);

    void delete(User user);

    void update(User user);
}
