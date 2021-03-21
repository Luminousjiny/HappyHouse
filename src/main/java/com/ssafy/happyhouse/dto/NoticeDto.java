package com.ssafy.happyhouse.dto;

public class NoticeDto {

	private int num; 			// 글번호
	private String title; 		// 글제목
	private String writer; 	// 작성자
	private int readCnt; 		// 조회수
	private String writeDate; 	// 작성일
	private String content; 	// 글 내용

	public NoticeDto() {}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getReadCnt() {
		return readCnt;
	}

	public void setReadCnt(int readCnt) {
		this.readCnt = readCnt;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "NoticeDto [num=" + num + ", title=" + title + ", writer=" + writer + ", readCnt=" + readCnt
				+ ", writeDate=" + writeDate + ", content=" + content + "]";
	}
	
}
