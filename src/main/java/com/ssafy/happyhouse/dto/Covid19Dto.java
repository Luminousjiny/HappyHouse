package com.ssafy.happyhouse.dto;

public class Covid19Dto {
	
	private String city;
	private String gugun;
	private String hospital_name;
	private String address;
	private String diagnosis_type;
	private String phone;
	
	public Covid19Dto() {}
	
	public Covid19Dto(String city, String gugun, String hospital_name, String address, String diagnosis_type,
			String phone) {
		this.city = city;
		this.gugun = gugun;
		this.hospital_name = hospital_name;
		this.address = address;
		this.diagnosis_type = diagnosis_type;
		this.phone = phone;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGugun() {
		return gugun;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}
	public String getHospital_name() {
		return hospital_name;
	}
	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDiagnosis_type() {
		return diagnosis_type;
	}
	public void setDiagnosis_type(String diagnosis_type) {
		this.diagnosis_type = diagnosis_type;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Covid19Dto [city=" + city + ", gugun=" + gugun + ", hospital_name=" + hospital_name + ", address="
				+ address + ", diagnosis_type=" + diagnosis_type + ", phone=" + phone + "]";
	}
	
}
