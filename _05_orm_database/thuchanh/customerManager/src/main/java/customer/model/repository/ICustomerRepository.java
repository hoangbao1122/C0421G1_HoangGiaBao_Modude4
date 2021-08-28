package customer.model.repository;

import customer.model.bean.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer>listAll();
    void save(Customer product);
    Customer findById(int id);
    void update(Customer product);
    void delete(int id);
    Customer search(String name);
}
