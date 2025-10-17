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

//	@GetMapping("/")
//	public String getMethodName_logtest() {
//		System.out.println("루트경로");
//		return myService.sayHello("안녕");
//	}

	@GetMapping("/ex321")
	public String getex321() {
		return myService.ex321();
	}

	@GetMapping("/ex70_int")
	public Integer ex70_int() {
		return myService.ex70_int();
	}

	@GetMapping("/ex322")
	public String getex322() {
		return myService.ex322();
	}

	@GetMapping("/ex323")
	public String getex323() {
		return myService.ex323();
	}

	@GetMapping("/ex324")
	public String getex324() {
		return myService.ex324();
	}

	@GetMapping("/ex325")
	public String getex325() {
		return myService.ex325();
	}

	@GetMapping("/ex326")
	public String getex326() {
		return myService.ex326();
	}

	@GetMapping("/ex327")
	public String getex327() {
		return myService.ex327();
	}

	@GetMapping("/ex328")
	public String getex328() {
		return myService.ex328();
	}

	@GetMapping("/ex331")
	public String getex331() {
		return myService.ex331();
	}

	@GetMapping("/ex332")
	public String getex332() {
		return myService.ex332();
	}

	@GetMapping("/ex333")
	public String getex333() {
		return myService.ex333();
	}
	
	@GetMapping("/ex334")
	public String getex334() {
		return myService.ex334();
	}
	
	@GetMapping("/ex335")
	public String getex335() {
		return myService.ex335();
	}
	
	@GetMapping("/ex336")
	public String getex336() {
		return myService.ex336();
	}
	
}
