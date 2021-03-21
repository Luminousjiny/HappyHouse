package com.ssafy.happyhouse.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.dto.QnaDto;
import com.ssafy.happyhouse.mapper.QnaMapper;

@Service
public class QnaService {
	
	@Autowired
	private SqlSession sqlSession;
	
	// 목록 보기
	public List<QnaDto> selectQList(){
		return sqlSession.getMapper(QnaMapper.class).selectQList();
	}
	
	// 검색 시 조회
	public List<QnaDto> searchQList(String keyword){
		return sqlSession.getMapper(QnaMapper.class).searchQList(keyword);
	}
	
	// 조회 detail
	public QnaDto detailQna(int qnum) {
		return sqlSession.getMapper(QnaMapper.class).detailQna(qnum);
	}
	
	// 추가
	public int insertQna(QnaDto dto){
		return sqlSession.getMapper(QnaMapper.class).insertQna(dto);
	}
	
	// 수정
	public int updateQna(QnaDto dto) {
		return sqlSession.getMapper(QnaMapper.class).updateQna(dto);
	}
	
	// 삭제
	public int deleteQna(int qnum) {
		return sqlSession.getMapper(QnaMapper.class).deleteQna(qnum);
	}
	
}
