package indi.xuebing.example.mapper;

import indi.xuebing.example.action.domain.QueryBlog;
import indi.xuebing.example.model.Blog;
import java.util.List;

public interface BlogMapper {

	public Blog findByID(Integer id);

	public void save(Blog blog);

	public void delete(Integer id);

	public void update(Blog blog);

    public List<Blog> list(QueryBlog qBlog);

    public Integer count(QueryBlog qBlog);
}
