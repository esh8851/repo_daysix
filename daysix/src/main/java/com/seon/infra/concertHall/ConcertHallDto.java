package com.seon.infra.concertHall;

import java.util.Date;

public class ConcertHallDto {
	
//	----------------------------- field S -----------------------------
//	concertHall
	private String hallSeq;
	private String hallName;
	private String hallAdr;
	private String hallAdrDt;
	private String hallZipNum;
	private String hallDesc;
	private Integer hallUseNy;
	private Integer hallDelNy;
	private String hallWi;
	private String hallGy;
	private Date hallDateTimeReg;
	private Date hallDateTimeEdit;
//	----------------------------- field E -----------------------------
	
	
//	----------------------------- getter & setter S -----------------------------
//	concertHall
	public String getHallSeq() {
		return hallSeq;
	}
	public void setHallSeq(String hallSeq) {
		this.hallSeq = hallSeq;
	}
	public String getHallName() {
		return hallName;
	}
	public void setHallName(String hallName) {
		this.hallName = hallName;
	}
	public String getHallAdr() {
		return hallAdr;
	}
	public void setHallAdr(String hallAdr) {
		this.hallAdr = hallAdr;
	}
	public String getHallAdrDt() {
		return hallAdrDt;
	}
	public void setHallAdrDt(String hallAdrDt) {
		this.hallAdrDt = hallAdrDt;
	}
	public String getHallZipNum() {
		return hallZipNum;
	}
	public void setHallZipNum(String hallZipNum) {
		this.hallZipNum = hallZipNum;
	}
	public String getHallDesc() {
		return hallDesc;
	}
	public void setHallDesc(String hallDesc) {
		this.hallDesc = hallDesc;
	}
	public Integer getHallUseNy() {
		return hallUseNy;
	}
	public void setHallUseNy(Integer hallUseNy) {
		this.hallUseNy = hallUseNy;
	}
	public Integer getHallDelNy() {
		return hallDelNy;
	}
	public void setHallDelNy(Integer hallDelNy) {
		this.hallDelNy = hallDelNy;
	}
	public String getHallWi() {
		return hallWi;
	}
	public void setHallWi(String hallWi) {
		this.hallWi = hallWi;
	}
	public String getHallGy() {
		return hallGy;
	}
	public void setHallGy(String hallGy) {
		this.hallGy = hallGy;
	}
	public Date getHallDateTimeReg() {
		return hallDateTimeReg;
	}
	public void setHallDateTimeReg(Date hallDateTimeReg) {
		this.hallDateTimeReg = hallDateTimeReg;
	}
	public Date getHallDateTimeEdit() {
		return hallDateTimeEdit;
	}
	public void setHallDateTimeEdit(Date hallDateTimeEdit) {
		this.hallDateTimeEdit = hallDateTimeEdit;
	}
	
//	----------------------------- getter & setter E -----------------------------

}
