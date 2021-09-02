package blog.demo.model.service;

import blog.demo.model.bean.Category;

import java.util.List;

public interface ICategoryService {
    List<Category>findAll();
    void save(Category category);
    Category findByid(int id);
    void delete(Category category);
    void update(Category category);
}
