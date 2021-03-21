package com.ssafy.happyhouse.dto;

public class MemberDto {
	
	private String userid;
	private String userpwd;
	private String username;
	private String email;
	private int admin; // boolean?
	private String phone;
	private String joindate;


	public MemberDto() {}
	
	public MemberDto(String userid, String userpwd, String username, String email, int admin, String phone) {
		this.userid = userid;
		this.userpwd = userpwd;
		this.username = username;
		this.email = email;
		this.admin = admin;
		this.phone = phone;
	}
	
	public MemberDto(String userid, String userpwd, String username, String email, int admin, String phone,
			String joindate) {
		this.userid = userid;
		this.userpwd = userpwd;
		this.username = username;
		this.email = email;
		this.admin = admin;
		this.phone = phone;
		this.joindate = joindate;
	}

	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getUserpwd() {
		return userpwd;
	}


	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAdmin() {
		return admin;
	}


	public void setAdmin(int admin) {
		this.admin = admin;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getJoindate() {
		return joindate;
	}


	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}


	@Override
	public String toString() {
		return "MemberDto [userid=" + userid + ", userpwd=" + userpwd + ", username=" + username + ", email=" + email
				+ ", admin=" + admin + ", phone=" + phone + ", joindate=" + joindate + "]";
	}

}

