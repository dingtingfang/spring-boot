package com.dtf.spring.ch3.conditional;

public class LinuxListService implements ListService {

	@Override
	public String showListCmd() {
		return "ls";
	}

}
