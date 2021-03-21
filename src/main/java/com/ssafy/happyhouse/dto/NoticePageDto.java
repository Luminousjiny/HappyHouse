package com.ssafy.happyhouse.dto;

import java.util.ArrayList;

public class NoticePageDto {
	
	private ArrayList<NoticeDto> noticeList;  // 페이지별 가져올 게시글 리스트
	private int curPage;					// 현재 페이지
	private int startPage;					// 시작 페이지
	private int endPage;					// 끝 페이지
	private int totalPage;					// 전체 페이지 개수
	
	public NoticePageDto() {}
	
	public NoticePageDto(ArrayList<NoticeDto> noticeList, int curPage, int startPage, int endPage, int totalPage) {
		this.noticeList = noticeList;
		this.curPage = curPage;
		this.startPage = startPage;
		this.endPage = endPage;
		this.totalPage = totalPage;
	}
	
	public ArrayList<NoticeDto> getNoticeList() {
		return noticeList;
	}
	public void setNoticeList(ArrayList<NoticeDto> noticeList) {
		this.noticeList = noticeList;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	
}
