package customer.model.Service;

import customer.model.bean.Customer;
import customer.model.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements ICustomerService{
    @Autowired
    private ICustomerRepository iCustomerRepository;
    @Override
    public List<Customer> listAll() {
        return this.iCustomerRepository.listAll();
    }

    @Override
    public void save(Customer customer) {
        this.iCustomerRepository.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return this.iCustomerRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        this.iCustomerRepository.delete(id);
    }

    @Override
    public void update(Customer customer) {
        this.iCustomerRepository.update(customer);
    }

    @Override
    public Customer search(String name) {
        return this.iCustomerRepository.search(name);
    }
}
