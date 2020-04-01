package com.udemy.spring.boot.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.udemy.spring.boot.springboot.dao.Dao;

@Component
public class Service {

	private Dao dao;

	@Autowired
	public Service(Dao dao) {
		System.out.println("Service Bean Created");
		this.dao = dao; 
	}

	public void save() {
		dao.create();
	}
}
