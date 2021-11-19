package blog.demo.model.service;

import blog.demo.model.bean.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog>findAll();
    void save(Blog blog);
    Blog findByid(int id);
    void delete(Blog blog);
    void update(Blog blog);
}
