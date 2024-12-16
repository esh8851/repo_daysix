package com.seon.infra.book;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BookDto {
	
//	----------------------------- field S -----------------------------
//	concert
	private String concertSeq;
	private String concertName;
	
//	photo
	private String pseq;
	private String path;
	
//	ticket
	private String tkSeq;
	private String tkNo;
	private String tkTime;
	private Integer tkDelNy;
	private String concertHall_hallSeq;
	
//	concertHall
	private String hallSeq;
	private String hallName;
	
//	seat
	private String stSeq;
	private Integer stTypeNy;
	private Integer stRating;
	private String stName;
	private Integer stPrice;
	private Integer stDelNy;
	
	private List<String> times;
	
//	book
	private String bkNo;
	private String bkDate;
	private String bkTime;
	private String bkConcert;
	private String bkHall;
	private Integer bkPrice;
	private String bkSeat;
	private Integer bkCount;
	private Date bkReg;
	private String member_mmSeq;
	
//	----------------------------- field E -----------------------------
	
	
//	----------------------------- getter & setter S -----------------------------
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
	
//	photo
	public String getPseq() {
		return pseq;
	}
	public void setPseq(String pseq) {
		this.pseq = pseq;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
//	ticket
	public String getTkSeq() {
		return tkSeq;
	}
	public void setTkSeq(String tkSeq) {
		this.tkSeq = tkSeq;
	}
	public String getTkNo() {
		return tkNo;
	}
	public void setTkNo(String tkNo) {
		this.tkNo = tkNo;
	}
	public String getTkTime() {
		return tkTime;
	}
	public void setTkTime(String tkTime) {
		this.tkTime = tkTime;
	}
	public Integer getTkDelNy() {
		return tkDelNy;
	}
	public void setTkDelNy(Integer tkDelNy) {
		this.tkDelNy = tkDelNy;
	}
	public String getConcertHall_hallSeq() {
		return concertHall_hallSeq;
	}
	public void setConcertHall_hallSeq(String concertHall_hallSeq) {
		this.concertHall_hallSeq = concertHall_hallSeq;
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
	
//	seat
	public String getStSeq() {
		return stSeq;
	}
	public void setStSeq(String stSeq) {
		this.stSeq = stSeq;
	}
	public Integer getStTypeNy() {
		return stTypeNy;
	}
	public void setStTypeNy(Integer stTypeNy) {
		this.stTypeNy = stTypeNy;
	}
	public Integer getStRating() {
		return stRating;
	}
	public void setStRating(Integer stRating) {
		this.stRating = stRating;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public Integer getStPrice() {
		return stPrice;
	}
	public void setStPrice(Integer stPrice) {
		this.stPrice = stPrice;
	}
	public Integer getStDelNy() {
		return stDelNy;
	}
	public void setStDelNy(Integer stDelNy) {
		this.stDelNy = stDelNy;
	}
	
	
	public List<String> getTimes() {
		return times;
	}
	public void setTimes(String times) {
		this.times = Arrays.asList(times.split(" "));
	}
	
	//	book
	public String getBkNo() {
		return bkNo;
	}
	public void setBkNo(String bkNo) {
		this.bkNo = bkNo;
	}
	public String getBkDate() {
		return bkDate;
	}
	public void setBkDate(String bkDate) {
		this.bkDate = bkDate;
	}
	public String getBkTime() {
		return bkTime;
	}
	public void setBkTime(String bkTime) {
		this.bkTime = bkTime;
	}
	public String getBkConcert() {
		return bkConcert;
	}
	public void setBkConcert(String bkConcert) {
		this.bkConcert = bkConcert;
	}
	public String getBkHall() {
		return bkHall;
	}
	public void setBkHall(String bkHall) {
		this.bkHall = bkHall;
	}
	public Integer getBkPrice() {
		return bkPrice;
	}
	public void setBkPrice(Integer bkPrice) {
		this.bkPrice = bkPrice;
	}
	public String getBkSeat() {
		return bkSeat;
	}
	public void setBkSeat(String bkSeat) {
		this.bkSeat = bkSeat;
	}
	public Integer getBkCount() {
		return bkCount;
	}
	public void setBkCount(Integer bkCount) {
		this.bkCount = bkCount;
	}
	public Date getBkReg() {
		return bkReg;
	}
	public void setBkReg(Date bkReg) {
		this.bkReg = bkReg;
	}
	public String getMember_mmSeq() {
		return member_mmSeq;
	}
	public void setMember_mmSeq(String member_mmSeq) {
		this.member_mmSeq = member_mmSeq;
	}
	
	
//	----------------------------- getter & setter E -----------------------------

}
