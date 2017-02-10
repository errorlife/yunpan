package cn.steffan.yunpan.hello;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@EnableAutoConfiguration
// @RequestMapping("viewController")
public class ViewController {
	@RequestMapping("/")
	public String getIndex(){
		System.out.println("-----------------ViewController1------------------");
		return "index";
	}	
	
	@RequestMapping("/uploadController1")
	public void ajaxAttachUpload() {
		System.out.println("--------------uploadController---------------------");
    }
	
	@RequestMapping("/uploadController")
    @ResponseBody
    public String handleFileUpload(@RequestParam("file")MultipartFile file){
		System.out.println(file);
       if(!file.isEmpty()){
           try {
              /*
               * 这段代码执行完毕之后，图片上传到了工程的跟路径；
               * 大家自己扩散下思维，如果我们想把图片上传到 d:/files大家是否能实现呢？
               * 等等;
               * 这里只是简单一个例子,请自行参考，融入到实际中可能需要大家自己做一些思考，比如：
               * 1、文件路径；
               * 2、文件名；
               * 3、文件格式;
               * 4、文件大小的限制;
               */
              BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));
              out.write(file.getBytes());
              out.flush();
              out.close();
           } catch (FileNotFoundException e) {
              e.printStackTrace();
              return"上传失败,"+e.getMessage();
           } catch (IOException e) {
              e.printStackTrace();
              return"上传失败,"+e.getMessage();
           }
           return"上传成功";
       }else{
           return"上传失败，因为文件是空的.";
       }
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
