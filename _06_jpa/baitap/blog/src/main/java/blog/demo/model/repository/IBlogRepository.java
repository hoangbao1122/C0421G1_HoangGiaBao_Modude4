package blog.demo.model.repository;

import blog.demo.model.bean.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog,Integer> {
}
