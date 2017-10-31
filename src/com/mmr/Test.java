package com.mmr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/mmr/applicationContex.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.setMessage("Hello Spring...");
        System.out.println(hello.getMessage());
        
        ApplicationContext context1 = new AnnotationConfigApplicationContext(HelloConfig.class);
        Hello hello1 = (Hello) context1.getBean("hello");
        hello1.setMessage("hello Spring 2");
        System.out.println(hello1.getMessage());
    }
}
