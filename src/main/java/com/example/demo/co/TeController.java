package com.example.demo.co;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Te")
public class TeController {
	
	@GetMapping(value="getTe",produces="application/json")
	public String getTe(){
		return "Te1";
	}
	@GetMapping(value="getTe1",produces="application/json")
	public String getTe1(){
		return "Te";
	}
	@GetMapping(value="getTe2",produces="application/json")
	protected String getTe2(){
		return "Te";
	}
	@GetMapping(value="getTe3",produces="application/json")
	String getTe3(){
		return "Te";
	}
	@GetMapping(value="getTe4",produces="application/json")
	private String getTe4(){
		return "Te";
	}
}
