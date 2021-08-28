package product.model.repository;

import product.model.bean.Product;

import java.util.List;

public interface IProductRepository {
    List<Product>listAll();
    void save(Product product);
    Product findById(int id);
    void update(Product product);
    void delete(int id);
    Product search(String name);
}
