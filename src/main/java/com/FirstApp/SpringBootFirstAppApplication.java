package com.FirstApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstAppApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(SpringBootFirstAppApplication.class, args);
		
		MyConnection m=ac.getBean("con", MyConnection.class);
		System.out.println(m);
	}

}
