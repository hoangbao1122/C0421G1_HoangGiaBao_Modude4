package customer.model.repository;


import customer.model.bean.Customer;

import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.*;

@Repository
@Transactional
public class CustomerRepositorympl implements ICustomerRepository {
    @PersistenceContext
    public EntityManager entityManager;

    @Override
    public List<Customer> listAll() {
        TypedQuery<Customer> query = entityManager.
                createQuery("select s from Customer as s", Customer.class);
        return query.getResultList();
    }

    @Override
    public void save(Customer product) {
        entityManager.persist(product);
    }

    @Override
    public Customer findById(int id) {
        return entityManager.find(Customer.class, id);
    }

    @Override
    public void update(Customer product) {
        entityManager.merge(product);
    }

    @Override
    public void delete(int id) {
        Customer customer = findById(id);
        if (customer != null) {
            entityManager.remove(customer);
        }
    }

    @Override
    public Customer search(String name) {
        return entityManager.find(Customer.class, name);
    }
}
