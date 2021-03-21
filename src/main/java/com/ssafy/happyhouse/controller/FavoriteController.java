package com.ssafy.happyhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.happyhouse.dto.FavoriteDto;
import com.ssafy.happyhouse.service.FavoriteService;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/favorite")
public class FavoriteController {
	
	@Autowired
	private FavoriteService fservice;
	
	// 찜 하기
	@PostMapping("/add")
	public String addFavorite(@RequestBody FavoriteDto fDto) {
		if(fservice.addFavorite(fDto)==1) {
			return "add-success";
		}
		return "add-fail";
	}
	
	// 찜 목록 가져오기
	@GetMapping("/getFavorites/{userid}")
	public List<FavoriteDto> getFavorites(@PathVariable("userid") String userid){
		System.out.println("실행이 된다.");
		System.out.println(userid);
		return fservice.getFavorites(userid);
	}
	
	// 찜인지 확인하기
	@PostMapping("/checkFavorites")
	public boolean checkFavorite(@RequestBody FavoriteDto fDto) {
		if(fservice.checkFavorite(fDto).size() != 0) { // 찜 목록에 있어.
			return true;
		}
		return false;
	}
	
	// 찜 목록에서 삭제하기
	@GetMapping("/delete/{idx}")
	public int deleteFavorite(@PathVariable("idx") int idx) {
		System.out.println(idx);
		return fservice.deleteFavorite(idx);
	}
	
}
