package com.ssafy.happyhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.happyhouse.dto.Covid19Dto;
import com.ssafy.happyhouse.service.Covid19Service;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/covid")
public class Covid19Controller {
	
	@Autowired
	private Covid19Service cservice;
	
	@GetMapping("/getCovid")
	public List<Covid19Dto> getCovid(Covid19Dto c){
		System.out.println(c.toString());
		return cservice.getCovid(c);
	}
	
	@GetMapping("/getHospital")
	public List<Covid19Dto> getHospital(Covid19Dto c){
		return cservice.getHospital(c);
	}
	
	
}
