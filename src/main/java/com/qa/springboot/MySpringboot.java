package com.qa.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qa.springboot.mapper")
public class MySpringboot {
	public static void main(String[] args) {
		SpringApplication.run(MySpringboot.class, args);
	}
}
