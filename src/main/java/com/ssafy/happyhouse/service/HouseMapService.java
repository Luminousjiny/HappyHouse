package com.ssafy.happyhouse.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.dto.HouseInfoDto;
import com.ssafy.happyhouse.dto.SidoGugunCodeDto;
import com.ssafy.happyhouse.mapper.HouseMapMapper;

@Service
public class HouseMapService {

	@Autowired
	private SqlSession sqlSession;
	
	public List<SidoGugunCodeDto> getSido() {
		return sqlSession.getMapper(HouseMapMapper.class).getSido();
	}

	public List<SidoGugunCodeDto> getGugunInSido(String sido_code) throws Exception {
		return sqlSession.getMapper(HouseMapMapper.class).getGugunInSido(sido_code);
	}

	public List<SidoGugunCodeDto> getDongInGugun(String gugun_code) throws Exception {
		return sqlSession.getMapper(HouseMapMapper.class).getDongInGugun(gugun_code);
	}
	
	public List<HouseInfoDto> getAptInDong(String dong_code) throws Exception {
		return sqlSession.getMapper(HouseMapMapper.class).getAptInDong(dong_code);
	}
	
	public List<HouseInfoDto> getAptInfoByName(String aptName) {
		return sqlSession.getMapper(HouseMapMapper.class).getAptInfoByName(aptName);
	}
	
}
