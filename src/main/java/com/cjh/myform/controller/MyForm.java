package com.cjh.myform.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cjh.myform.dto.ArticleRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class MyForm {

//  웹주소창에 가능, Form에 가능
//	http://localhost:8080/article-get?title=제목&content=get
	@GetMapping("/article-get")
	public String arricleGet(@RequestParam String title, @RequestParam String content) {
		String result = "제목: " +title + "\n" + "<br>내용: " + content;
		return result;
	}

//  Form화면 테스트 가능	
// 	http://localhost:8080/article-post
	@PostMapping("/article-post")
	public String articlePost(@ModelAttribute ArticleRequest request) {
		String result = "제목: " + request.title() + "<br>내용: " + request.content();
		return result;
	}
	
// 포스트맨으로 테스트하세요
//  http://localhost:8080/article-postman
	@PostMapping("/article-postman")
	public String articlePostman(@RequestBody ArticleRequest request) {
		String result = "제목: " + request.title() + "\n내용: " + request.content();
		return result;
	}
	
//  Form화면 테스트 가능, 포스트맨 테스트 가능
//  Body Json raw로는 null뜸
//  http://localhost:8080/article-auto
	@PostMapping("/article-auto")
	public String articleAuto(ArticleRequest request) {
		String result = "제목: " + request.title() + "\n내용: " + request.content();
		return result;
	}
}
