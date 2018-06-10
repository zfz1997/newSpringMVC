package com.zfz.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zfz.entities.User;

@Controller
public class HelloWorld {
private static final String SUCCESS = "success";
    
    /**
     * 1. ʹ�� @RequestMapping ע����ӳ�������URL
     * 2. ����ֵ��ͨ����ͼ����������Ϊʵ�ʵ�������ͼ������InternalResourceViewResolver��ͼ������
     * ͨ�� prefix + returnValue + suffix ���ַ������õ�ʵ��������ͼ����ִ��ת���������籾���л�ת���� /WEB-INF/views/success.jsp
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
