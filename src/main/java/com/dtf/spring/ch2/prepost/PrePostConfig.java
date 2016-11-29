package com.dtf.spring.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.dtf.spring.ch2.prepost")
public class PrePostConfig {
   
    @Bean(initMethod="init",destroyMethod="destory")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }
    
    @Bean
    JSR250WayService jrs250WayService(){
        return new JSR250WayService();
    }
    
}
