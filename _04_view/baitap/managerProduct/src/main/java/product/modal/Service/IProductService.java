package product.modal.Service;

import product.modal.bean.Product;

import java.util.List;

public interface IProductService {
    List<Product>listAll();
    void save(Product product);
    Product findById(int id);
    void update(int id,Product product);
    void delete(int id);
    Product search(String name);
}
