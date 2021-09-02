package page.demo.model.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import page.demo.model.bean.Customer;

import java.util.List;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);
    void save(Customer customer);
    Customer findById(int id);
    void delete(Customer customer);
    Page<Customer> findAllByNameContaining(String name, Pageable pageable);
}
