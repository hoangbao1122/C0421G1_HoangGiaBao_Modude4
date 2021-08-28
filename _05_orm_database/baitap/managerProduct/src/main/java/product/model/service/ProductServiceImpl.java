package product.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import product.model.bean.Product;
import product.model.repository.IProductRepository;
import product.model.repository.ProductRepositoryImpl;

import java.util.List;
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;
    @Override
    public List<Product> listAll() {
        return this.iProductRepository.listAll();
    }

    @Override
    public void save(Product product) {
        this.iProductRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return this.iProductRepository.findById(id);
    }

    @Override
    public void update(Product product) {
    this.iProductRepository.update(product);
    }

    @Override
    public void delete(int id) {
    this.iProductRepository.delete(id);
    }

    @Override
    public Product search(String name) {
        return this.iProductRepository.search(name);
    }
}
