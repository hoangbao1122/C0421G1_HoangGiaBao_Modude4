package blog.demo.model.service;

import blog.demo.model.bean.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);
    void save(Blog blog);
    Blog findByid(int id);
    void delete(Blog blog);
    void update(Blog blog);
    Page<Blog> findAllByNameContaining(String name,Pageable pageable);
}
