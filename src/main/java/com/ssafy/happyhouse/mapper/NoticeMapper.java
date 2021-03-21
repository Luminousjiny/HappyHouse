package com.ssafy.happyhouse.mapper;

import java.util.List;

import com.ssafy.happyhouse.dto.NoticeDto;


public interface NoticeMapper {
	
	// 목록보기
		public List<NoticeDto> selectNList();
		// 검색 시 조회
		public List<NoticeDto> searchNList(String keyword);
		// 조회 detail
		public NoticeDto detailNotice(int num);
		// 추가
		public int insertNotice(NoticeDto dto);
		// 수정
		public int updateNotice(NoticeDto dto);
		// 삭제
		public int deleteNotice(int num);
    
}
