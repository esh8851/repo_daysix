package com.seon.infra.indexUsr;

import java.util.Date;

public class IndexUsrDto {
	
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
	private Integer concertTodayNy;
	
//	photo
	private String path;
	
//	reply
	private Integer replyCount;
	
//	score
	private String csSeq;
	private Integer scoreVote;
	private Double scoreAvg;
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
	public Integer getConcertTodayNy() {
		return concertTodayNy;
	}
	public void setConcertTodayNy(Integer concertTodayNy) {
		this.concertTodayNy = concertTodayNy;
	}
	public String getPath() {
		return path;
	}
	
//	photo
	public void setPath(String path) {
		this.path = path;
	}
	
//	reply
	public Integer getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(Integer replyCount) {
		this.replyCount = replyCount;
	}
	
//	score
	public String getCsSeq() {
		return csSeq;
	}
	public void setCsSeq(String csSeq) {
		this.csSeq = csSeq;
	}
	public void setScoreVote(Integer scoreVote) {
		this.scoreVote = scoreVote;
	}
	public Integer getScoreVote() {
		return scoreVote;
	}
	public Double getScoreAvg() {
		return scoreAvg;
	}
	public void setScoreAvg(Double scoreAvg) {
		this.scoreAvg = scoreAvg;
	}
	
	
//	----------------------------- getter & setter E -----------------------------

	
}