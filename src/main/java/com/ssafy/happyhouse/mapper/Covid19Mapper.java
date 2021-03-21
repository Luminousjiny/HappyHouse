package com.ssafy.happyhouse.mapper;

import java.util.List;

import com.ssafy.happyhouse.dto.Covid19Dto;

public interface Covid19Mapper {
	
	// 사용자가 입력한 시도와 구군에 있는 선별진료소 가져오기
	public List<Covid19Dto> getCovid(Covid19Dto c);
	
	// 사용자가 입력한 시도와 구군에 있는 국민안심병원 가져오기
	public List<Covid19Dto> getHospital(Covid19Dto c);
}
