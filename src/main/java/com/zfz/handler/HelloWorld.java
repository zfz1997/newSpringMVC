package com.zfz.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zfz.entities.User;

@Controller
public class HelloWorld {
private static final String SUCCESS = "success";
    
    /**
     * 1. 使用 @RequestMapping 注解来映射请求的URL
     * 2. 返回值会通过视图解析器解析为实际的物理视图，对于InternalResourceViewResolver视图解析器
     * 通过 prefix + returnValue + suffix 这种方法来得到实际物理视图，再执行转发操作，如本例中会转发到 /WEB-INF/views/success.jsp
     * 
     */
    @RequestMapping("/helloworld")
    public String hello()
    {
        System.out.println("hello world");
        return SUCCESS;
    }
    @RequestMapping("/testPojo")
    public String testPojo(User user) {
    	System.out.println("testPojo: " + user);
        return SUCCESS;
    }
}
