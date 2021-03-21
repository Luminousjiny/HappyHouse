package com.ssafy.happyhouse.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.happyhouse.dto.HouseInfoDto;
import com.ssafy.happyhouse.dto.SidoGugunCodeDto;
import com.ssafy.happyhouse.service.HouseMapService;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/map")
public class HouseMapController {
	
	@Autowired
	private HouseMapService hservice;
	
	// 동별 검색
	@GetMapping("/getSido")
	public List<SidoGugunCodeDto> getSido() throws Exception {
		return hservice.getSido();
	}
	
	@GetMapping(path="/getGugun", produces = "application/json;charset=UTF-8")
	public List<SidoGugunCodeDto> getMapSidoGugun(@RequestParam("sido_code") String sido_code) throws Exception {
		return hservice.getGugunInSido(sido_code);
	}
	
	@GetMapping("/getDong")
	public List<SidoGugunCodeDto> getDong(@RequestParam("gugun_code") String gugun_code) throws Exception {
		System.out.println(gugun_code);
		return hservice.getDongInGugun(gugun_code);
	}
	
	@GetMapping("/getRealEstate")
	public List<HouseInfoDto> getRealEstate(@RequestParam("dong_code") String dong_code) throws Exception {
		return hservice.getAptInDong(dong_code); 
	}
	
	// 아파트별 검색
	@GetMapping("/getAptInfoByName")
	public List<HouseInfoDto> getAptInfoByName(@RequestParam("aptName") String aptName) throws Exception {
		return hservice.getAptInfoByName(aptName);
	}
	
}
