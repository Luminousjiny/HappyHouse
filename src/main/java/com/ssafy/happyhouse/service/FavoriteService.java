package com.ssafy.happyhouse.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.dto.FavoriteDto;
import com.ssafy.happyhouse.mapper.FavoriteMapper;

@Service
public class FavoriteService {

	@Autowired
	private SqlSession sqlSession;
	
	public int addFavorite(FavoriteDto fDto) {
		return sqlSession.getMapper(FavoriteMapper.class).addFavorite(fDto);
	}
	
	public List<FavoriteDto> getFavorites(String userid) {
		return sqlSession.getMapper(FavoriteMapper.class).getFavorites(userid);
	}
	
	public List<FavoriteDto> checkFavorite(FavoriteDto fDto) {
		return sqlSession.getMapper(FavoriteMapper.class).checkFavorite(fDto);
	}
	
	public int deleteFavorite(int idx) {
		return sqlSession.getMapper(FavoriteMapper.class).deleteFavorite(idx);
	}
}
