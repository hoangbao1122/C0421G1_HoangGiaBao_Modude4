package blog.demo.model.service;

import blog.demo.model.bean.Blog;
import blog.demo.model.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService{
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public List<Blog> findAll() {
        return this.iBlogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        this.iBlogRepository.save(blog);
    }

    @Override
    public Blog findByid(int id) {
        return this.iBlogRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        this.iBlogRepository.deleteById(id);
    }

    @Override
    public void update(Blog blog) {
        this.iBlogRepository.save(blog);
    }
}
