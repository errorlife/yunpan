package cn.steffan.yunpan.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("viewController")
public class ViewController {
	@RequestMapping("/index")
	public String getIndex(){
		return "index.jsp";
	}
	
	@RequestMapping("/")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index.jsp";  
    }
}
