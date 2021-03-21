package com.ssafy.happyhouse.dto;

public class QnaDto {

	private int qnum;
	private String qtitle;
	private String qwriter;
	private String qwritedate;
	private String qcontent;
	
	public QnaDto() {}
	
	public QnaDto(String qtitle, String qcontent) {
		this.qtitle = qtitle;
		this.qcontent = qcontent;
	}

	public QnaDto(String qtitle, String qwriter, String qwritedate, String qcontent) {
		this.qtitle = qtitle;
		this.qwriter = qwriter;
		this.qwritedate = qwritedate;
		this.qcontent = qcontent;
	}
	
	public QnaDto(int qnum, String qtitle, String qwriter, String qwritedate, String qcontent) {
		this.qnum = qnum;
		this.qtitle = qtitle;
		this.qwriter = qwriter;
		this.qwritedate = qwritedate;
		this.qcontent = qcontent;
	}


	public int getQnum() {
		return qnum;
	}



	public void setQnum(int qnum) {
		this.qnum = qnum;
	}



	public String getQtitle() {
		return qtitle;
	}



	public void setQtitle(String qtitle) {
		this.qtitle = qtitle;
	}



	public String getQwriter() {
		return qwriter;
	}



	public void setQwriter(String qwriter) {
		this.qwriter = qwriter;
	}



	public String getQwritedate() {
		return qwritedate;
	}



	public void setQwritedate(String qwritedate) {
		this.qwritedate = qwritedate;
	}



	public String getQcontent() {
		return qcontent;
	}



	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}



	@Override
	public String toString() {
		return "QnaDto [qnum=" + qnum + ", qtitle=" + qtitle + ", qwriter=" + qwriter + ", qwritedate=" + qwritedate
				+ ", qcontent=" + qcontent + "]";
	}
	
	
	
}
