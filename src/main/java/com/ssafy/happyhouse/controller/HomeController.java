package com.ssafy.happyhouse.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/qna")
	public String qna() {
		return "qna";
	}
}
