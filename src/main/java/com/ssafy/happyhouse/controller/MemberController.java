package com.ssafy.happyhouse.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.happyhouse.dto.MemberDto;
import com.ssafy.happyhouse.service.JwtService;
import com.ssafy.happyhouse.service.MemberService;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/user")
public class MemberController {

	@Autowired
	private MemberService mservice;
	
	@Autowired
	private JwtService jwtService;
	
	public static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	// 로그인
	@PostMapping("/confirm/login")
	public ResponseEntity<Map<String, Object>> login(@RequestBody MemberDto memberDto, HttpServletResponse response, HttpSession session) {
		Map<String, Object> resultMap = new HashMap<>();
		HttpStatus status = null;
		try {
			MemberDto loginUser = mservice.login(memberDto);
			
			if(loginUser != null) {
//				jwt.io에서 확인
//				로그인 성공했다면 토큰을 생성한다.
				String token = jwtService.create(loginUser);
				logger.trace("로그인 토큰정보 : {}", token);
				
//				토큰 정보는 response의 헤더로 보내고 나머지는 Map에 담는다.
//				response.setHeader("auth-token", token);
				resultMap.put("auth-token", token);
				resultMap.put("user-id", loginUser.getUserid());
				resultMap.put("user-name", loginUser.getUsername());
//				resultMap.put("status", true);
//				resultMap.put("data", loginUser);
				status = HttpStatus.ACCEPTED;
			} else {
				resultMap.put("message", "로그인 실패");
				status = HttpStatus.ACCEPTED;
			}
		} catch (Exception e) {
			logger.error("로그인 실패 : {}", e);
			resultMap.put("message", e.getMessage());
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<Map<String, Object>>(resultMap, status);
	}
	
	// 아이디 체크
	@GetMapping("/idCheck/{userid}")
	public String getjoin(@PathVariable("userid") String userid) {
		if(mservice.checkId(userid) != null) { // 아이디가 데이터베이스에 있으면,
			return "exist";
		}
		return "non-exist";
	}
	
	// 회원가입
	@PostMapping("/join")
	public String insertMember(@RequestBody MemberDto memberDto) {
		if(mservice.join(memberDto) == 1) {
			return "join-success";
		}
		return "join-fail";
	}
	
	// 마이페이지
	@GetMapping("/userInfo/{userid}")
	public MemberDto getUserInfo(@PathVariable("userid") String userid) {
		return mservice.getUserInfo(userid);
	}
	
	// 회원 정보수정
	@PostMapping("/update")
	public String updateMember(@RequestBody MemberDto memberDto) {
		if(mservice.update(memberDto)==1) {
			return "update-success";
		}
		return "update-fail";
	}
	
	// 관리자 : 사용자 관리(삭제)
	@PostMapping("/adminCheck")
	public String adminCheck(@RequestBody String userid) {
		if(mservice.adminCheck(userid)!=null) {
			return "isAdmin";
		}
		return "isNotAdmin";
	}
	
	// 사용자 비밀번호 수정하기
	
////////////////////////////////////////////////////////////////////////////////////////////
	
	// 관리자 모드일때 회원 관리 부분
	// 목록보기 
	@GetMapping("/list")
	public List<MemberDto> selectUList() {
	List<MemberDto> uList = mservice.selectUList();
	return uList;
	}	
	
	// 검색 시 조회
	@GetMapping("/search/{keyword}")
	public List<MemberDto> searchUList(@PathVariable("keyword") String keyword) {
	List<MemberDto> uList = mservice.searchUList(keyword);
	return uList;
	}	
	
	// 조회 detail
	@GetMapping("/detail/{userid}")
	public MemberDto detailUser(@PathVariable("userid") String userid) {
	MemberDto dto = mservice.detailUser(userid);
	return dto;
	}
	
	// 추가
	@PostMapping("/insert")
	public int insertUser(@RequestBody MemberDto dto) {
	return mservice.insertUser(dto);
	}
	
	// 수정
	@PostMapping("/modify")
	public int updateUser(@RequestBody MemberDto dto) {
	System.out.println(dto); // TODO : debugging
	int result = mservice.updateUser(dto);
	return result;
	}
	
	// 삭제
	@GetMapping("/delete/{userid}")
	public int deleteUser(@PathVariable("userid") String userid) {
	return mservice.deleteUser(userid);
	}
		
}
