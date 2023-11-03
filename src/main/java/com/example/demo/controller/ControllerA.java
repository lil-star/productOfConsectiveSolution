package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.util.Solution;

@RestController
public class ControllerA {

	@Autowired
	private Solution solution;
	
	@GetMapping("/solution")
	public String solution(@RequestParam String a, @RequestParam String b) {
		int result = 0;
		try {
			result = solution.result(a, b);
		}catch (NumberFormatException e) {
			return "Invalid inputs";
		}
		return String.valueOf(result);
	}
}
