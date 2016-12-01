package com.dtf.spring.ch3.TaskExecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsycTaskService {
	
	@Async //异步方法
	public void executeAsycTask(Integer i){
		System.out.println("执行异步任务："+i);
	}
	
	@Async
	public void executeAsycTaskPlus(Integer i){
		System.out.println("执行异步任务+1："+(i+1));
	}
}
