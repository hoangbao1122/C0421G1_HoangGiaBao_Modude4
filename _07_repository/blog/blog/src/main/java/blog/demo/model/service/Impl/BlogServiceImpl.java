package blog.demo.model.service.Impl;

import blog.demo.model.bean.Blog;
import blog.demo.model.repository.IBlogRepository;
import blog.demo.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;


    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return this.iBlogRepository.findAll(pageable);
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
    public void delete(Blog blog) {
        this.iBlogRepository.delete(blog);
    }

    @Override
    public void update(Blog blog) {
        this.iBlogRepository.save(blog);
    }
}
