package com.mukgoNolgo.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/")
	public String login() {
		return "login";
	}
	@GetMapping("/member")
	public String member() {
		return "member";
	}
	
}
