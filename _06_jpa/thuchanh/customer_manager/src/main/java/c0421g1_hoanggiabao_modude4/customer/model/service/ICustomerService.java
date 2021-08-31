package c0421g1_hoanggiabao_modude4.customer.model.service;

import c0421g1_hoanggiabao_modude4.customer.model.bean.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void delete(int id);
    void update(Customer customer);
}
