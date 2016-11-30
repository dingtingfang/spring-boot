package com.dtf.spring.ch3.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Service;

@Service
public class BeanFactoryHelper implements BeanFactoryAware{
	
	private static BeanFactory beanFactory; //BEAN工厂
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
	
	public static BeanFactory getBeanfactory() {   
        return beanFactory;   
    }

}
