package com.example.demo.calculator.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.calculator.dto.CalculationRequest;
import com.example.demo.calculator.dto.CalculationResponse;
import com.example.demo.calculator.service.CalculatorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("calculator")
// "/어쩌고" 전에 "/calculator"라고 경로에 적어야함
// 기능별 구분가능
public class CalculatorController {

	// 사용법1: Autowired 어노테이션을 사용하는 방법(가장 심플): 객체obj
	// @Autowired
	// CalculatorService calculatorService; 타입(클래스) 오브젝트이름;

	// 사용법2: 생성자를 사용하는 방법: 객체obj
	CalculatorService calculatorService;

	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	@PostMapping("/calculate")
	public CalculationResponse calculat(@RequestBody CalculationRequest request) {
		String result = calculatorService.calculate(request.getNum1(), request.getNum2(), request.getOperation());
		
		return new CalculationResponse(request.getNum1(), request.getNum2(), request.getOperation(), result);
	}
	
	
	// @GetMapping("/add")
	// public String add(@RequestParam double num1, @RequestParam double num2) {

	// return "덧셈";
	// 오브젝트.메소드();
	// return calculatorService.add();
	// return calculatorService.add(num1, num2);

	// http://localhost:8080/calculator/add?num1=10&num2=2
	@GetMapping("/add")
	public CalculationResponse add(@RequestParam double num1, @RequestParam double num2) {
		String result = calculatorService.add(num1, num2);
		return new CalculationResponse(num1, num2, "ADD", result);
		// 자바식으론: CalculationResponse cal1_Response = new CalculatorResponse(num1, num2,
		// "ADD", result);
	}

	// @GetMapping("/subtract")
	// public String subtract(@RequestParam double num1, @RequestParam double num2)
	// {
	// return "뺄셈";
	// return calculatorService.subtract(num1, num2);
	// }

	// http://localhost:8080/calculator/subtract?num1=10&num2=2
	@GetMapping("/subtract")
	public CalculationResponse subtract(@RequestParam double num1, @RequestParam double num2) {
		String result = calculatorService.subtract(num1, num2);
		return new CalculationResponse(num1, num2, "SUBTRACT", result);
	}

	// public String multiply(@RequestParam double num1, @RequestParam double num2)
	// {
	// return "곱셈";
	// return calculatorService.multiply(num1, num2);
	// }

	// http://localhost:8080/calculator/multiply?num1=10&num2=2
	@GetMapping("/multiply")
	public CalculationResponse multiply(@RequestParam double num1, @RequestParam double num2) {
		String result = calculatorService.multiply(num1, num2);
		return new CalculationResponse(num1, num2, "MULTIPLY", result);
	}

	// @GetMapping("/divide")
	// public String divide(@RequestParam double num1, @RequestParam double num2) {
	// return "나눗셈";
	// return calculatorService.divide(num1, num2);
	// }

	// http://localhost:8080/calculator/divide?num1=10&num2=2
	@GetMapping("/divide")
	public CalculationResponse divide(@RequestParam double num1, @RequestParam double num2) {
		String result = calculatorService.divide(num1, num2);
		return new CalculationResponse(num1, num2, "DIVIDE", result);
	}

}
