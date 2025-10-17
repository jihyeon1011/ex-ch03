package com.cjh.ex_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//==========================================================
//@Controller 값이 아니고, 화면 페이지의 이름을 return하는 컨트롤러
//스프링화면템플릿:타임리프: https://www.thymeleaf.org/index.html
//스프링화면템플릿:머스테치: https://mustache.github.io/
//==========================================================

@Controller
public class MyThymeleaf {

	@GetMapping("/hello")
	public String Hello() {
		return "hello";
	}
	
	@GetMapping("/thymeleaf")
	public String thymeleaf(Model model) {
		model.addAttribute("message", "스프링부트 타임리프 화면");
		return "hello_thymeleaf";
	}
	
	@GetMapping("/mustache")
	public String mustache(Model model) {
		model.addAttribute("message", "머스테치 화면");
		return "hello_mu";
	}
	
}
