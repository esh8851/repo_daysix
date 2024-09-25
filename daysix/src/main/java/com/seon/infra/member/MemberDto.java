package com.seon.infra.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberDto {
	
//	----------------------------- field S -----------------------------
//	table
	private String mmSeq;
	private String mmName;
	private Integer mmGender;
	private String mmId;
	private String mmEmail;
	private String mmPw;
	private String mmBirth;
	private String mmPhone;
	private Date mmDateTimeReg;
	private Date mmDateTimeEdit;
	private Integer mmUseNy;
	private Integer mmDelNy;
//	----------------------------- field E -----------------------------
	
//	----------------------------- getter & setter S -----------------------------
//	table
	public String getMmSeq() {
		return mmSeq;
	}
	public void setMmSeq(String mmSeq) {
		this.mmSeq = mmSeq;
	}
	public String getMmName() {
		return mmName;
	}
	public void setMmName(String mmName) {
		this.mmName = mmName;
	}
	public Integer getMmGender() {
		return mmGender;
	}
	public void setMmGender(Integer mmGender) {
		this.mmGender = mmGender;
	}
	public String getMmId() {
		return mmId;
	}
	public void setMmId(String mmId) {
		this.mmId = mmId;
	}
	public String getMmEmail() {
		return mmEmail;
	}
	public void setMmEmail(String mmEmail) {
		this.mmEmail = mmEmail;
	}
	public String getMmPw() {
		return mmPw;
	}
	public void setMmPw(String mmPw) {
		this.mmPw = mmPw;
	}
	public String getMmBirth() {
		return mmBirth;
	}
	public void setMmBirth(String mmBirth) {
		this.mmBirth = mmBirth;
	}
	public String getMmPhone() {
		return mmPhone;
	}
	public void setMmPhone(String mmPhone) {
		this.mmPhone = mmPhone;
	}
	public Date getMmDateTimeReg() {
		return mmDateTimeReg;
	}
	public void setMmDateTimeReg(Date mmDateTimeReg) {
		this.mmDateTimeReg = mmDateTimeReg;
	}
	public Date getMmDateTimeEdit() {
		return mmDateTimeEdit;
	}
	public void setMmDateTimeEdit(Date mmDateTimeEdit) {
		this.mmDateTimeEdit = mmDateTimeEdit;
	}
	public Integer getMmUseNy() {
		return mmUseNy;
	}
	public void setMmUseNy(Integer mmUseNy) {
		this.mmUseNy = mmUseNy;
	}
	public Integer getMmDelNy() {
		return mmDelNy;
	}
	public void setMmDelNy(Integer mmDelNy) {
		this.mmDelNy = mmDelNy;
	}
//	----------------------------- getter & setter E -----------------------------
	
	
}
