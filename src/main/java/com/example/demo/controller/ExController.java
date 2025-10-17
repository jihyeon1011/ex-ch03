package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.ExService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ExController {

	// 자바가 객체를 new로 생성하는 방식
	// MyService myService = new MyService();

	ExService exService;

	public ExController(ExService exService) {
		this.exService = exService;
	}

//	@GetMapping("/")
//	public String getMethodName_logtest() {
//		System.out.println("루트경로");
//		return myService.sayHello("안녕");
//	}

	@GetMapping("/ex321")
	public String getex321() {
		return exService.ex321();
	}

	@GetMapping("/ex70_int")
	public Integer ex70_int() {
		return exService.ex70_int();
	}

	@GetMapping("/ex322")
	public String getex322() {
		return exService.ex322();
	}

	@GetMapping("/ex323")
	public String getex323() {
		return exService.ex323();
	}

	@GetMapping("/ex324")
	public String getex324() {
		return exService.ex324();
	}

	@GetMapping("/ex325")
	public String getex325() {
		return exService.ex325();
	}

	@GetMapping("/ex326")
	public String getex326() {
		return exService.ex326();
	}

	@GetMapping("/ex327")
	public String getex327() {
		return exService.ex327();
	}

	@GetMapping("/ex328")
	public String getex328() {
		return exService.ex328();
	}

	@GetMapping("/ex331")
	public String getex331() {
		return exService.ex331();
	}

	@GetMapping("/ex332")
	public String getex332() {
		return exService.ex332();
	}

	@GetMapping("/ex333")
	public String getex333() {
		return exService.ex333();
	}
	
	@GetMapping("/ex334")
	public String getex334() {
		return exService.ex334();
	}
	
	@GetMapping("/ex335")
	public String getex335() {
		return exService.ex335();
	}
	
	@GetMapping("/ex336")
	public String getex336() {
		return exService.ex336();
	}
	
	@GetMapping("/ex337")
	public String getex337() {
		return exService.ex337();
	}
	
	@GetMapping("/ex338")
	public String getex338() {
		return exService.ex338();
	}
	
}
