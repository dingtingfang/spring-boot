package com.dtf.spring.ch2.el;

import com.dtf.spring.ch2.el.ELConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
        
        ELConfig elConfig = context.getBean(ELConfig.class);
        elConfig.ourputResource();
        
        context.close();
    }

}
