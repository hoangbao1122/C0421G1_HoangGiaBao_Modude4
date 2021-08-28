package product.model.repository;
import org.springframework.stereotype.Repository;
import product.model.bean.Product;
import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.*;

@Repository
@Transactional
public class ProductRepositoryImpl implements IProductRepository {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Product> listAll() {
        TypedQuery<Product> query = entityManager.createQuery("SELECT s FROM Product as s", Product.class);
        return query.getResultList();
    }

    @Override
    public void save(Product product) {
        entityManager.persist(product);
    }

    @Override
    public Product findById(int id) {
        return entityManager.find(Product.class, id);
    }

    @Override
    public void update(Product product) {
     entityManager.merge(product);
    }

    @Override
    public void delete(int id) {
        Product product = findById(id);
        if (product != null) {
            entityManager.remove(product);
        }
    }

    @Override
    public Product search(String name) {
        TypedQuery<Product> query = entityManager.createQuery
                ("select c from Product as c where c.name=:name", Product.class);
        query.setParameter("name", name);
        return query.getSingleResult();
    }
}
