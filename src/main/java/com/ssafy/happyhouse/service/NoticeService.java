package com.ssafy.happyhouse.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.dto.NoticeDto;
import com.ssafy.happyhouse.mapper.NoticeMapper;


@Service 
public class NoticeService {
	
	@Autowired
	private SqlSession sqlSession;
	
	// 목록 보기
		public List<NoticeDto> selectNList(){
			return sqlSession.getMapper(NoticeMapper.class).selectNList();
		}
		
		// 검색 시 조회
		public List<NoticeDto> searchNList(String keyword){
			return sqlSession.getMapper(NoticeMapper.class).searchNList(keyword);
		}
		
		// 조회 detail
		public NoticeDto detailNotice(int num) {
			return sqlSession.getMapper(NoticeMapper.class).detailNotice(num);
		}
		
		// 추가
		public int insertNotice(NoticeDto dto){
			return sqlSession.getMapper(NoticeMapper.class).insertNotice(dto);
		}
		
		// 수정
		public int updateNotice(NoticeDto dto) {
			return sqlSession.getMapper(NoticeMapper.class).updateNotice(dto);
		}
		
		// 삭제
		public int deleteNotice(int num) {
			return sqlSession.getMapper(NoticeMapper.class).deleteNotice(num);
		}
	
}
