package com.example.demo.main.vo;

import java.sql.Date;

public class Member {
	
	private int memberNo;
	private String memberId;
	private String memberPw;
	private String memberTel;
	private Date rgstDt;
	private String memberType;
	private String secessionYn;
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberTel() {
		return memberTel;
	}
	public void setMemberTel(String memberTel) {
		this.memberTel = memberTel;
	}
	public Date getRgstDt() {
		return rgstDt;
	}
	public void setRgstDt(Date rgstDt) {
		this.rgstDt = rgstDt;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	public String getSecessionYn() {
		return secessionYn;
	}
	public void setSecessionYn(String secessionYn) {
		this.secessionYn = secessionYn;
	}
	
	

}
