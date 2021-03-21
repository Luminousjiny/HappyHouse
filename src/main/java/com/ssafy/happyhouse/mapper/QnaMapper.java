package com.ssafy.happyhouse.mapper;

import java.util.List;

import com.ssafy.happyhouse.dto.QnaDto;

public interface QnaMapper {
	
	// 목록보기
	public List<QnaDto> selectQList();
	// 검색 시 조회
	public List<QnaDto> searchQList(String keyword);
	// 조회 detail
	public QnaDto detailQna(int qnum);
	// 추가
	public int insertQna(QnaDto dto);
	// 수정
	public int updateQna(QnaDto dto);
	// 삭제
	public int deleteQna(int qnum);
	
}
