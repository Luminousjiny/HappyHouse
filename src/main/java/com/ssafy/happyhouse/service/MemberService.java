package com.ssafy.happyhouse.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.dto.MemberDto;
import com.ssafy.happyhouse.mapper.MemberMapper;


@Service
public class MemberService {
	
	@Autowired
	private SqlSession sqlSession;
	
	public MemberDto login(MemberDto memberDto) throws Exception {
		return sqlSession.getMapper(MemberMapper.class).login(memberDto);
	}	
	
	public String checkId(String userid) {
		return sqlSession.getMapper(MemberMapper.class).checkId(userid);
	}
	
	public int join(MemberDto memberDto) {
		return sqlSession.getMapper(MemberMapper.class).join(memberDto);
	}
	
	public MemberDto getUserInfo(String userid) {
		return sqlSession.getMapper(MemberMapper.class).getUserInfo(userid);
	}
	
	public int update(MemberDto memberDto) {
		return sqlSession.getMapper(MemberMapper.class).update(memberDto);
	}
	
	public MemberDto adminCheck(String userid) {
		return sqlSession.getMapper(MemberMapper.class).adminCheck(userid);
	}
	
	// 회원 관리
		public List<MemberDto> selectUList() {
			return sqlSession.getMapper(MemberMapper.class).selectUList();
		}

		public List<MemberDto> searchUList(String keyword) {
			return sqlSession.getMapper(MemberMapper.class).searchUList(keyword);
		}

		public MemberDto detailUser(String userid) {
			return sqlSession.getMapper(MemberMapper.class).detailUser(userid);
		}

		public int insertUser(MemberDto dto) {
			return sqlSession.getMapper(MemberMapper.class).insertUser(dto);
		}

		public int updateUser(MemberDto dto) {
			return sqlSession.getMapper(MemberMapper.class).updateUser(dto);
		}

		public int deleteUser(String userid) {
			return sqlSession.getMapper(MemberMapper.class).deleteUser(userid);
		}

}
