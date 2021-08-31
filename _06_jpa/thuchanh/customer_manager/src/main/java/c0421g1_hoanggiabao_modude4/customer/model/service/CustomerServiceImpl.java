package c0421g1_hoanggiabao_modude4.customer.model.service;

import c0421g1_hoanggiabao_modude4.customer.model.bean.Customer;
import c0421g1_hoanggiabao_modude4.customer.model.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public List<Customer> findAll() {
        return this.iCustomerRepository.findAll();

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
    public void delete(int id) {
        this.iCustomerRepository.deleteById(id);
    }

    @Override
    public void update(Customer customer) {
            this.iCustomerRepository.save(customer);

    }
}
