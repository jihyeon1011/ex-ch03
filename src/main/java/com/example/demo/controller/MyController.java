package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class MyController {

	// 자바가 객체를 new로 생성하는 방식
	// MyService myService = new MyService();

	MyService myService;

	public MyController(MyService myService) {
		this.myService = myService;
	}

	@GetMapping("/")
	public String getMethodName_logtest() {
		System.out.println("루트경로");
		return myService.sayHello("안녕");
	}

	@GetMapping("/ex70")
	public String ex70() {
		return myService.ex70();
	}

	@GetMapping("/ex70_int")
	public Integer ex70_int() {
		return myService.ex70_int();
	}

}
