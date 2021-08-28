package product.model.repository;

import product.model.bean.Product;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class ProductRepository implements IProductRepository {
    private static Map<Integer, Product> map = null;

    static {
        map = new HashMap<>();
        map.put(1, new Product(1, "bao", "100000", "sam sum"));
        map.put(2, new Product(2, "hoang", "300000", "nokia"));
        map.put(3, new Product(3, "gia", "200000", "apple"));
    }

    @Override
    public List<Product> listAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public void save(Product product) {
        map.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return map.get(id);
    }

    @Override
    public void update(int id, Product product) {
        map.put(id, product);
    }

    @Override
    public void delete(int id) {
        map.remove(id);
    }

    @Override
    public Product search(String name) {
        Collection<Product> values = map.values();
        List<Product> products = new ArrayList<>(values);
        for (Product product:products){
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
}
