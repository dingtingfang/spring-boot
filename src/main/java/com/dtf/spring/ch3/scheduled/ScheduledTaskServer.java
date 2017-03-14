package com.dtf.spring.ch3.scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
@Service
public class ScheduledTaskServer {
	private static final SimpleDateFormat  dataFormat= new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime(){
		System.out.println("每隔五秒执行一次 "+dataFormat.format(new Date()));
	}
	
	@Scheduled(cron="0 0/1 * * * ?")
	public void fixTimeExecution(){
		System.out.println("在指定时间 " +dataFormat.format(new Date()));
	}
}
