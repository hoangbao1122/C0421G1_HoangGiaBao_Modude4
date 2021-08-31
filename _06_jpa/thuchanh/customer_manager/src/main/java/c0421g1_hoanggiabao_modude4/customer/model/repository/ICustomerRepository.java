package c0421g1_hoanggiabao_modude4.customer.model.repository;

import c0421g1_hoanggiabao_modude4.customer.model.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
}
