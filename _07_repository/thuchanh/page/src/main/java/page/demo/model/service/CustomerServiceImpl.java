package page.demo.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import page.demo.model.bean.Customer;
import page.demo.model.repository.ICustomerRepository;

import java.util.List;
@Service
public class CustomerServiceImpl implements ICustomerService{
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return this.iCustomerRepository.findAll(pageable);
    }

    @Override
    public void save(Customer customer) {
        this.iCustomerRepository.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return this.iCustomerRepository.findById(id).get();
    }

    @Override
    public void delete(Customer customer) {
        this.iCustomerRepository.delete(customer);
    }

    @Override
    public Page<Customer> findAllByNameContaining(String name, Pageable pageable) {
        return this.iCustomerRepository.findAllByNameContaining(name,pageable);
    }

}
