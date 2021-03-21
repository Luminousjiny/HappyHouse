package com.ssafy.happyhouse.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.happyhouse.dto.NoticeDto;
import com.ssafy.happyhouse.service.NoticeService;


@CrossOrigin(origins="*", maxAge = 6000)
@RestController
@RequestMapping("/notice")
public class NoticeController {
	
	@Autowired
	private NoticeService nservice;
	
	// 목록보기 
		@GetMapping("/list")
		public List<NoticeDto> selectNList() {
			List<NoticeDto> nList = nservice.selectNList();
			return nList;
		}	
		
		// 검색 시 조회
		@GetMapping("/search/{keyword}")
		public List<NoticeDto> searchNList(@PathVariable("keyword") String keyword) {
			List<NoticeDto> nList = nservice.searchNList(keyword);
			return nList;
		}	
		
		// 조회 detail
		@GetMapping("/detail/{num}")
		public NoticeDto detailNotice(@PathVariable("num") int num) {
			NoticeDto dto = nservice.detailNotice(num);
			return dto;
		}
		
		// 추가
		@PostMapping("/insert")
		public int insertNotice(@RequestBody NoticeDto dto, HttpServletRequest req) {
			
//			HttpSession session = req.getSession();
//			MemberDto mdto = (MemberDto) session.getAttribute("loginInfo");
			
			int result = 0;
			
//			int admin = mdto.getAdmin();
//			if(admin == 1) {
//				dto.setQwriter(mdto.getNickname());
				dto.setWriter("ADMIN"); // 제거해야함
				result = nservice.insertNotice(dto);
//			}
			return result;
		}
		
		// 수정
		@PostMapping("/update")
		public int updateNotice(@RequestBody NoticeDto dto) {
			int result = nservice.updateNotice(dto);
			return result;
		}
		
		// 삭제
		@GetMapping("/delete/{num}")
		public int deleteNotice(@PathVariable("num") int num) {
			int result = nservice.deleteNotice(num);
			return result;
		}
}
