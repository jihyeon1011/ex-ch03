package com.cjh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//@ComponentScan(basePackages = {"com.cjh", "com.cjh.myform", "com.cjh.ex_thymeleaf", "com.cjh.mybatis"})
//@MapperScan("com.cjh.mybatis.mapper")
@SpringBootApplication
public class Ch03Application {

	public static void main(String[] args) {
		SpringApplication.run(Ch03Application.class, args);
	}

}
