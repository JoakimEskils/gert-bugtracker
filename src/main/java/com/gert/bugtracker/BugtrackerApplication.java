package com.gert.bugtracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class BugtrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BugtrackerApplication.class, args);
	}

	@GetMapping("/hello-world")
	@ResponseBody
	String index() {
		return "index";
	}
}
