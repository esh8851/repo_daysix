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
	
//	count
	private Integer replyCount;
	
//	hall
	private String hallSeq;
	private String hallName;
	private String hallWi;
	private String hallGy;
	
//	reply
	private String replySeq;
	private String replyText;
	private Date replyDateTime;
	private String member_mmSeq;
	private String concert_concertSeq;
	
//	member
	private String mmName;
	
//	star
	private String stSeq;
	private Integer stStar;
	private Integer stVote;
	private Integer stRating;
	
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
	
	//	count
	public Integer getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(Integer replyCount) {
		this.replyCount = replyCount;
	}
	
	//	hall
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
	
	//	reply
	public String getReplySeq() {
		return replySeq;
	}
	public void setReplySeq(String replySeq) {
		this.replySeq = replySeq;
	}
	public String getReplyText() {
		return replyText;
	}
	public void setReplyText(String replyText) {
		this.replyText = replyText;
	}
	public Date getReplyDateTime() {
		return replyDateTime;
	}
	public void setReplyDateTime(Date replyDateTime) {
		this.replyDateTime = replyDateTime;
	}
	public String getMember_mmSeq() {
		return member_mmSeq;
	}
	public void setMember_mmSeq(String member_mmSeq) {
		this.member_mmSeq = member_mmSeq;
	}
	public String getConcert_concertSeq() {
		return concert_concertSeq;
	}
	public void setConcert_concertSeq(String concert_concertSeq) {
		this.concert_concertSeq = concert_concertSeq;
	}
	
//	member
	public String getMmName() {
		return mmName;
	}
	public void setMmName(String mmName) {
		this.mmName = mmName;
	}
	
//	star
	public String getStSeq() {
		return stSeq;
	}
	public void setStSeq(String stSeq) {
		this.stSeq = stSeq;
	}
	public Integer getStStar() {
		return stStar;
	}
	public void setStStar(Integer stStar) {
		this.stStar = stStar;
	}
	public Integer getStVote() {
		return stVote;
	}
	public void setStVote(Integer stVote) {
		this.stVote = stVote;
	}
	public Integer getStRating() {
		return stRating;
	}
	public void setStRating(Integer stRating) {
		this.stRating = stRating;
	}
	
//	----------------------------- getter & setter E -----------------------------

}
