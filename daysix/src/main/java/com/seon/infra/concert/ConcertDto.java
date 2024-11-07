package com.seon.infra.concert;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

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
	
//	photo
	private String pseq;
	private Integer type;
	private Integer defaultNy;
	private Integer sort;
	private String path;
	private String tableName;
	private String originalName;
	private String uuidName;
	private String ext;
	private Long size;
	
//	score
	private String csSeq;
	private Integer csStar;
	private Integer csVote;
	
	private Float starAvg;
	
//	AWS
	private MultipartFile uploadFile;
	private MultipartFile[] uploadFiles;
	
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
	
//	photo
	public String getPseq() {
		return pseq;
	}
	public void setPseq(String pseq) {
		this.pseq = pseq;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getDefaultNy() {
		return defaultNy;
	}
	public void setDefaultNy(Integer defaultNy) {
		this.defaultNy = defaultNy;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getOriginalName() {
		return originalName;
	}
	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}
	public String getUuidName() {
		return uuidName;
	}
	public void setUuidName(String uuidName) {
		this.uuidName = uuidName;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	
//	score
	public String getCsSeq() {
		return csSeq;
	}
	public void setCsSeq(String csSeq) {
		this.csSeq = csSeq;
	}
	public Integer getCsStar() {
		return csStar;
	}
	public void setCsStar(Integer csStar) {
		this.csStar = csStar;
	}
	public Integer getCsVote() {
		return csVote;
	}
	public void setCsVote(Integer csVote) {
		this.csVote = csVote;
	}
	public Float getStarAvg() {
		return starAvg;
	}
	public void setStarAvg(Float starAvg) {
		this.starAvg = starAvg;
	}
	
	//	AWS
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public MultipartFile[] getUploadFiles() {
		return uploadFiles;
	}
	public void setUploadFiles(MultipartFile[] uploadFiles) {
		this.uploadFiles = uploadFiles;
	}
	
	
//	----------------------------- getter & setter E -----------------------------

}
