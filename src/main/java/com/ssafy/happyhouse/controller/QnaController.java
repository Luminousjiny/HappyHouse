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

import com.ssafy.happyhouse.dto.QnaDto;
import com.ssafy.happyhouse.service.QnaService;

@CrossOrigin(origins="*", maxAge = 6000)
@RestController
@RequestMapping("/qna")
public class QnaController {
	
	@Autowired
	private QnaService qservice;
	
	// 목록보기 
	@GetMapping("/list")
	public List<QnaDto> selectQList() {
		List<QnaDto> qList = qservice.selectQList();
		return qList;
	}	
	
	// 검색 시 조회
	@GetMapping("/search/{keyword}")
	public List<QnaDto> searchQList(@PathVariable("keyword") String keyword) {
		List<QnaDto> qList = qservice.searchQList(keyword);
		return qList;
	}	
	
	// 조회 detail
	@GetMapping("/detail/{qnum}")
	public QnaDto detailQna(@PathVariable("qnum") int qnum) {
		QnaDto dto = qservice.detailQna(qnum);
		return dto;
	}
	
	// 추가
	@PostMapping("/insert")
	public int insertQna(@RequestBody QnaDto dto, HttpServletRequest req) {
		
//		HttpSession session = req.getSession();
//		MemberDto mdto = (MemberDto) session.getAttribute("loginInfo");
		
		int result = 0;
		
//		int admin = mdto.getAdmin();
//		if(admin == 1) {
//			dto.setQwriter(mdto.getNickname());
			dto.setQwriter("ADMIN"); // 제거해야함
			result = qservice.insertQna(dto);
//		}
		return result;
	}
	
	// 수정
	@PostMapping("/update")
	public int updateQna(@RequestBody QnaDto dto) {
		int result = qservice.updateQna(dto);
		return result;
	}
	
	// 삭제
	@GetMapping("/delete/{qnum}")
	public int deleteQna(@PathVariable("qnum") int qnum) {
		int result = qservice.deleteQna(qnum);
		return result;
	}
	
}
