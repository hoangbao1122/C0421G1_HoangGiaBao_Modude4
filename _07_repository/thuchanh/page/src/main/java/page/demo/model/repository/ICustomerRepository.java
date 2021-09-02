package page.demo.model.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import page.demo.model.bean.Customer;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
        Page<Customer> findAllByNameContaining(String name, Pageable pageable);
}
