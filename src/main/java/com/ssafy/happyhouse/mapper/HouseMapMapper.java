package com.ssafy.happyhouse.mapper;

import java.util.List;

import com.ssafy.happyhouse.dto.HouseInfoDto;
import com.ssafy.happyhouse.dto.SidoGugunCodeDto;

public interface HouseMapMapper {
	
	public List<SidoGugunCodeDto> getSido();
	public List<SidoGugunCodeDto> getGugunInSido(String sido);
	public List<SidoGugunCodeDto> getDongInGugun(String gugun_code);
	public List<HouseInfoDto> getAptInDong(String dong);
	public List<HouseInfoDto> getAptInfoByName(String aptName);
}
