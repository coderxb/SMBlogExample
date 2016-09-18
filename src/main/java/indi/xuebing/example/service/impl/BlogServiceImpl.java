package indi.xuebing.example.service.impl;

import indi.xuebing.example.action.domain.QueryBlog;
import indi.xuebing.example.mapper.BlogMapper;
import indi.xuebing.example.model.Blog;
import indi.xuebing.example.service.BlogService;
import indi.xuebing.example.utils.Page;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService{

	@Autowired private BlogMapper blogMapper;

	@Override
	public Blog findByID(Integer id) {
		return blogMapper.findByID(id);
	}

	@Override
	public void save(Blog blog) {
		blogMapper.save(blog);
	}

	@Override
	public void delete(Integer id) {
		blogMapper.delete(id);
	}

	@Override
	public void update(Blog blog) {
		blogMapper.update(blog);
	}

	@Override
    public List<Blog> list(QueryBlog qBlog) {
        return blogMapper.list(qBlog);
	}

    @Override
    public Integer count(QueryBlog qBlog) {
        return blogMapper.count(qBlog);
    }

    @Override
    public Page<Blog> pageBlog(QueryBlog qBlog) {
        Integer blogRecords = count(qBlog);
        Page<Blog> page = new Page<Blog>(qBlog.getPageNo(), blogRecords);
        List<Blog> blogList = list(qBlog);
        page.setDataList(blogList);
        return page;
    }

}
