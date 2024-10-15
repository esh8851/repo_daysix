package com.seon.infra.concert;

import java.util.Date;

public class ConcertDto {
	
//	----------------------------- field S -----------------------------
//	concert
	private String concertSeq;
	private String concertName;
	private Integer concertPlayTime;
	private String concertDate;
	private String concertSinger;
	private Integer concertAge;
	private String concertGenre;
	private String concertDesc;
	private Date concertDateTimeReg;
	private Date concertDateTimeEdit;
	private Integer concertUseNy;
	private Integer concertDelNy;
	
//	concertHall
	private String hallSeq;
	private String hallName;
	private String hallAdr;
	private String hallAdrDt;
	private String hallZipNum;
	private Integer hallUseNy;
	private Integer hallDelNy;
	private String hallWi;
	private String hallGy;
//	----------------------------- field E -----------------------------
	
	
//	----------------------------- getter & setter S -----------------------------
//	concert
	public String getConcertSeq() {
		return concertSeq;
	}
	public void setConcertSeq(String concertSeq) {
		this.concertSeq = concertSeq;
	}
	public String getConcertName() {
		return concertName;
	}
	public void setConcertName(String concertName) {
		this.concertName = concertName;
	}
	public Integer getConcertPlayTime() {
		return concertPlayTime;
	}
	public void setConcertPlayTime(Integer concertPlayTime) {
		this.concertPlayTime = concertPlayTime;
	}
	public String getConcertDate() {
		return concertDate;
	}
	public void setConcertDate(String concertDate) {
		this.concertDate = concertDate;
	}
	public String getConcertSinger() {
		return concertSinger;
	}
	public void setConcertSinger(String concertSinger) {
		this.concertSinger = concertSinger;
	}
	public Integer getConcertAge() {
		return concertAge;
	}
	public void setConcertAge(Integer concertAge) {
		this.concertAge = concertAge;
	}
	public String getConcertGenre() {
		return concertGenre;
	}
	public void setConcertGenre(String concertGenre) {
		this.concertGenre = concertGenre;
	}
	public String getConcertDesc() {
		return concertDesc;
	}
	public void setConcertDesc(String concertDesc) {
		this.concertDesc = concertDesc;
	}
	public Date getConcertDateTimeReg() {
		return concertDateTimeReg;
	}
	public void setConcertDateTimeReg(Date concertDateTimeReg) {
		this.concertDateTimeReg = concertDateTimeReg;
	}
	public Date getConcertDateTimeEdit() {
		return concertDateTimeEdit;
	}
	public void setConcertDateTimeEdit(Date concertDateTimeEdit) {
		this.concertDateTimeEdit = concertDateTimeEdit;
	}
	public Integer getConcertUseNy() {
		return concertUseNy;
	}
	public void setConcertUseNy(Integer concertUseNy) {
		this.concertUseNy = concertUseNy;
	}
	public Integer getConcertDelNy() {
		return concertDelNy;
	}
	public void setConcertDelNy(Integer concertDelNy) {
		this.concertDelNy = concertDelNy;
	}
	
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
	
//	----------------------------- getter & setter E -----------------------------

}
