package indi.xuebing.example.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexAction {

	/**
	 * 首页
	 * @return
	 */
	@RequestMapping(value={"/", "/index.html"}, method=RequestMethod.GET)
	public String index(){
		return "index";
	}

}
