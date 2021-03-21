package com.ssafy.happyhouse.mapper;

import java.util.List;

import com.ssafy.happyhouse.dto.MemberDto;

public interface MemberMapper {
	
	public MemberDto login(MemberDto memberDto);
	public String checkId(String userid);
	public int join(MemberDto memberDto);
	public MemberDto getUserInfo(String userid);
	public int update(MemberDto memberDto);
	public MemberDto adminCheck(String userid);
	// 회원관리
	public List<MemberDto> selectUList();
	public List<MemberDto> searchUList(String keyword);
	public MemberDto detailUser(String userid);
	public int insertUser(MemberDto dto);
	public int updateUser(MemberDto dto);
	public int deleteUser(String userid);
}
