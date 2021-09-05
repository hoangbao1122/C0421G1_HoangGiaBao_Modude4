package validateformregister.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import validateformregister.demo.model.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
}
