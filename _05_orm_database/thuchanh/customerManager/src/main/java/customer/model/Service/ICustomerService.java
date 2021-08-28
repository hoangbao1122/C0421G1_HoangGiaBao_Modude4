package customer.model.Service;

import customer.model.bean.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> listAll();
    void save(Customer customer);
    Customer findById(int id);
    void delete(int id);
    void update(Customer customer);
    Customer search(String name);
}
