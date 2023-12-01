package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;

@RestController
@SwaggerDefinition
@Api
public class TestController {
	@GetMapping("test")
	public String test() {
		return "working";
	}
}
