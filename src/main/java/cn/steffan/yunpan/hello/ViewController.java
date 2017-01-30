package cn.steffan.yunpan.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ViewController")
public class ViewController {
	@RequestMapping("/index")
	public String getIndex(){
		return "index";
	}
	
	@RequestMapping("/")
	public String get(){
		return "index";
	}
}
