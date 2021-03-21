package com.ssafy.happyhouse.dto;

public class FavoriteDto {
	
	private int idx; 
	private String userid; // 유저 아이디
	private int amount; // 거래 금액 - 매매만 가지고 있음
	private String name; // 매물 이름
	private String date; // 날짜
	private String buildYear; // 건축일자
	private String area; // 면적
	private String deposit; // 보증 금액
	private String monthlyPay; // 월세 금액
	private int floor; // 층
	private int type; // 0: 아파트, 1: 연립다세대, 2: 단독*다가구, 3: 오피스텔
	private String address; // 주소
	
	public FavoriteDto() {}

	public FavoriteDto(String userid, int amount, String name, String date, String buildYear, String area,
			String deposit, String monthlyPay, int floor, int type, String address) {
		this.userid = userid;
		this.amount = amount;
		this.name = name;
		this.date = date;
		this.buildYear = buildYear;
		this.area = area;
		this.deposit = deposit;
		this.monthlyPay = monthlyPay;
		this.floor = floor;
		this.type = type;
		this.address = address;
	}
	
	public FavoriteDto(int idx, String userid, int amount, String name, String date, String buildYear, String area,
			String deposit, String monthlyPay, int floor, int type, String address) {
		this.idx = idx;
		this.userid = userid;
		this.amount = amount;
		this.name = name;
		this.date = date;
		this.buildYear = buildYear;
		this.area = area;
		this.deposit = deposit;
		this.monthlyPay = monthlyPay;
		this.floor = floor;
		this.type = type;
		this.address = address;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBuildYear() {
		return buildYear;
	}

	public void setBuildYear(String buildYear) {
		this.buildYear = buildYear;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public String getMonthlyPay() {
		return monthlyPay;
	}

	public void setMonthlyPay(String monthlyPay) {
		this.monthlyPay = monthlyPay;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "FavoriteDto [idx=" + idx + ", userid=" + userid + ", amount=" + amount + ", name=" + name + ", date="
				+ date + ", buildYear=" + buildYear + ", area=" + area + ", deposit=" + deposit + ", monthlyPay="
				+ monthlyPay + ", floor=" + floor + ", type=" + type + ", address=" + address + "]";
	}
	
	

}
