package com.ssafy.happyhouse.dto;

public class SidoGugunCodeDto {

	private String sido_code;
	private String sido_name;
	private String gugun_code;
	private String gugun_name;
	private String dongcode;
	private String dong;
	
	public SidoGugunCodeDto() {}
	
	
	public SidoGugunCodeDto(String sido_code, String sido_name, String gugun_code, String gugun_name, String dongcode, String dong) {
		super();
		this.sido_code = sido_code;
		this.sido_name = sido_name;
		this.gugun_code = gugun_code;
		this.gugun_name = gugun_name;
		this.dongcode = dongcode;
		this.dong = dong;
	}


	public String getSido_code() {
		return sido_code;
	}
	public void setSido_code(String sido_code) {
		this.sido_code = sido_code;
	}
	public String getSido_name() {
		return sido_name;
	}
	public void setSido_name(String sido_name) {
		this.sido_name = sido_name;
	}
	public String getGugun_code() {
		return gugun_code;
	}
	public void setGugun_code(String gugun_code) {
		this.gugun_code = gugun_code;
	}
	public String getGugun_name() {
		return gugun_name;
	}
	public void setGugun_name(String gugun_name) {
		this.gugun_name = gugun_name;
	}

	@Override
	public String toString() {
		return "SidoGugunCodeDto [sido_code=" + sido_code + ", sido_name=" + sido_name + ", gugun_code=" + gugun_code
				+ ", gugun_name=" + gugun_name + "]";
	}


	public String getDongcode() {
		return dongcode;
	}


	public void setDongcode(String dongcode) {
		this.dongcode = dongcode;
	}


	public String getDong() {
		return dong;
	}


	public void setDong(String dong) {
		this.dong = dong;
	}
	
}
