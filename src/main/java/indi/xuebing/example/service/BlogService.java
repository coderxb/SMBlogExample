package indi.xuebing.example.service;

import indi.xuebing.example.action.domain.QueryBlog;
import indi.xuebing.example.model.Blog;
import indi.xuebing.example.utils.Page;
import java.util.List;

public interface BlogService {

	/**
	 * 根据id查找博文
	 * @param id
	 * @return Blog
	 */
	public Blog findByID(Integer id);

	/**
	 * 保存博文
	 * @param blog
	 */
	public void save(Blog blog);

	/**
	 * 删除某篇博文
	 * @param id
	 */
	public void delete(Integer id);

	/**
	 * 更新某篇博文
	 * @param blog
	 */
	public void update(Blog blog);

	/**
	 * 博文列表
	 * @return
	 */
    public List<Blog> list(QueryBlog qBlog);

    /**
     * 博文总数
     * @return
     */
    public Integer count(QueryBlog qBlog);

    /**
     * 博文列表分页
     * @return
     */
    public Page<Blog> pageBlog(QueryBlog qBlog);
}
