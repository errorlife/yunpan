package cn.steffan.yunpan.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
// @RequestMapping("viewController")
public class ViewController {
	@RequestMapping("/")
	public String getIndex(){
		System.out.println("-----------------ViewController1------------------");
		return "index";
	}	
	
	@RequestMapping("/uploadController")
	public String getUploadController(){
		System.out.println("--------------uploadController---------------------");
		return "ok";
	}
	
	@RequestMapping("/fileController")
	public String getFileController(){
		System.out.println("--------------fileController---------------------");
		return "ok";
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SpringApplication.run(ViewController.class, args);
	}
}
