package com.ssafy.happyhouse.mapper;

import java.util.List;

import com.ssafy.happyhouse.dto.FavoriteDto;

public interface FavoriteMapper {
	
	public int addFavorite(FavoriteDto fDto);
	public List<FavoriteDto> getFavorites(String userid);
	public List<FavoriteDto> checkFavorite(FavoriteDto fDto);
	public int deleteFavorite(int idx);
	
}
