package validateformregister.demo.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import validateformregister.demo.model.entity.User;
import validateformregister.demo.model.repository.IUserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserRepository iUserRepository;

    @Override
    public List<User> findAll() {
        return this.iUserRepository.findAll();
    }

    @Override
    public void save(User user) {
        this.iUserRepository.save(user);
    }

    @Override
    public User findByid(int id) {
        return this.iUserRepository.findById(id).get();
    }

    @Override
    public void delete(User user) {
        this.iUserRepository.delete(user);
    }

    @Override
    public void update(User user) {
        this.iUserRepository.save(user);
    }
}
