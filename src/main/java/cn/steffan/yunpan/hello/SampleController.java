package cn.steffan.yunpan.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {

	@RequestMapping("/hello")
	@ResponseBody
	String home(){
		return "Hello World!";
	}
	
	@RequestMapping("/")
	@ResponseBody
	String index(){
		System.out.println("-----------------SampleController------------------");
		return "index";
	}
	
/*	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SpringApplication.run(SampleController.class, args);
	}*/

}
