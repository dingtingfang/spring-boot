package com.dtf.spring.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@CacheConfig
@ComponentScan("com.dtf.spring.ch2.el")
@PropertySource("classpath:com/dtf/spring/ch2/el/temp.properties")
public class ELConfig {
    @Value("I love you")
    private String normal;
    
    @Value("#{systemProperties['os.name']}")
    private String osName;
    
    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;
    
    @Value("#{demoService.another}")
    private String fromAuthor;
    
    @Value("classpath:com/dtf/spring/ch2/el/temp.txt")
    private Resource testFile;
    
    @Value("http://www.baidu.com")
    private Resource testUrl;
    
    @Value("${book.name}")
    private String bookName;
    
    @Autowired
    private Environment environment; 
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfiger(){
        return new PropertySourcesPlaceholderConfigurer();
    }
    
    public void ourputResource(){
        try{
            System.out.println(normal);
            
            System.out.println(osName);
            
            System.out.println(randomNumber);
            
            System.out.println(fromAuthor);
            
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            
            System.out.println(bookName);
            
            System.out.println(environment.getProperty("book.author"));
        }catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
