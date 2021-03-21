package com.ssafy.happyhouse.service;

import java.util.List;

import javax.websocket.server.ServerEndpoint;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.dto.Covid19Dto;
import com.ssafy.happyhouse.mapper.Covid19Mapper;

@Service
public class Covid19Service {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<Covid19Dto> getCovid(Covid19Dto c){
		return sqlSession.getMapper(Covid19Mapper.class).getCovid(c);
	}
	
	public List<Covid19Dto> getHospital(Covid19Dto c){
		return sqlSession.getMapper(Covid19Mapper.class).getHospital(c);
	}
	
}
