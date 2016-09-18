package indi.xuebing.example.action;

import indi.xuebing.example.action.domain.QueryBlog;
import indi.xuebing.example.model.Blog;
import indi.xuebing.example.service.BlogService;
import indi.xuebing.example.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogAction {

	@Autowired private BlogService blogService;

	/**
	 * blog页
	 * @return
	 */
    @RequestMapping(value = "/blog", method = RequestMethod.GET)
    public String index(Model model, QueryBlog qBlog) {
        Page<Blog> page = blogService.pageBlog(qBlog);
        model.addAttribute("page", page);
		return "blog/blog";
	}

	/**
	 * 跳转到创建页
	 * @return
	 */
	@RequestMapping(value = "/blog/add.html", method = RequestMethod.GET)
	public String add() {
		return "blog/add";
	}

	/**
	 * 跳转到保存
	 * @param blogId
	 * @return
	 */
	@RequestMapping(value = "/blog/save", method = RequestMethod.POST)
	public String save(Blog blog) {
		blogService.save(blog);

		return "redirect:/blog.html";
	}

	/**
	 * 编辑
	 * @param model
	 * @param blogId
	 * @return
	 */
	@RequestMapping(value = "/blog/edit/{blogId}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable Integer blogId) {
		Blog blog = blogService.findByID(blogId);

		model.addAttribute("blog", blog);
		return "blog/edit";
	}

	/**
	 * 更新
	 * @param blogId
	 * @return
	 */
	@RequestMapping(value = "/blog/update", method = RequestMethod.POST)
	public String update(Blog blog) {
		blogService.update(blog);

		return "redirect:/blog.html";
	}

	/**
	 * 删除
	 * @param blogId
	 * @return
	 */
	@RequestMapping(value = "/blog/delete/{blogId}", method = RequestMethod.GET)
	public String delete(@PathVariable Integer blogId) {
		blogService.delete(blogId);

		return "redirect:/blog.html";
	}

}
