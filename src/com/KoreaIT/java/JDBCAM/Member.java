package com.KoreaIT.java.JDBCAM;

import java.time.LocalDateTime;
import java.util.Map;

public class Member {
	int id;
	LocalDateTime regtime;
	LocalDateTime updateDate;
	String loginId;
	String loginPw;
	String name;

	public Member(Map<String, Object> memberMap) {
		this.id = (int) memberMap.get("id");
		this.regtime = (LocalDateTime) memberMap.get("regDate");
		this.updateDate = (LocalDateTime) memberMap.get("regDate");
		this.loginId = (String) memberMap.get("loginId");
		this.loginPw = (String) memberMap.get("loginPw");
		this.name = (String) memberMap.get("name");

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getRegtime() {
		return regtime;
	}

	public void setRegtime(LocalDateTime regtime) {
		this.regtime = regtime;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPw() {
		return loginPw;
	}

	public void setLoginPw(String loginPw) {
		this.loginPw = loginPw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
