package com.example.demo.service;

import com.example.demo.controller.MyController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	// private final MyController myController;

	private static final Logger log = LoggerFactory.getLogger(MyService.class);

	// MyService(MyController myController) {
	// this.myController = myController;

	public String sayHello(String hi) {

		String msg = hi + "좋은날";
		System.out.println(msg);
		log.info(msg);
		return msg;
	}

	public String ex70() {

		String result = "";
		int number = 1;

		if (number == 1) {
			result = "if 블록입니다.";
		} else if (number == 2) {
			result = "else if 블록입니다.";
		} else {
			result = "else 블록입니다.";
		}
		System.out.println(result);
		log.info(result);

		String msg = "ex70결과는: " + result;
		return msg;
	}

	public Integer ex70_int() {
		log.info("999");
		return 999;
	}

}