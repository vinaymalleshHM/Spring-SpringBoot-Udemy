package com.udemy.spring.boot.springboot;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringbootApplicationTests {

	@Autowired
	private ApplicationContext context;

	@Disabled
	@Test
	void contextLoads() {
	}
	
	@Test
	void testservice() {
		Service service = context.getBean(Service.class);
		service.save();
	}


}
