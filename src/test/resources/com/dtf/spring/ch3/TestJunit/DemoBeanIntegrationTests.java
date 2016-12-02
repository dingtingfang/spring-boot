package com.dtf.spring.ch3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dtf.spring.ch3.TestJunit.TestBean;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(class={TestConfig.class})
@ActiveProfiles("prod")
public class DemoBeanIntegrationTests {
	
	@Autowired
	private TestBean testBean;
	
	@Test
	public void proBeanShouldInject(){
		String excuted = "from prouct test profile";
		String actual = testBean.getContext();
		Assert.assertEquals(excuted, actual);
	}
}
