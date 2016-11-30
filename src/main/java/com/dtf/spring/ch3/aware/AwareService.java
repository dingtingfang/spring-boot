package com.dtf.spring.ch3.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service("awareService")
public class AwareService implements BeanNameAware,ResourceLoaderAware {
	
	private String beanName;
	
	private ResourceLoader resourceLoader;

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
	
	public void outputResult(){
		System.out.println("beanName:"+this.beanName);
		
		Resource resource = resourceLoader.getResource("classpath:com/dtf/spring/ch3/aware/test.txt");
		
		try {
			System.out.println("ResourceLoader 加载文件：test.txt 输出："+IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
