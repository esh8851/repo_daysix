package com.seon.infra.book;

public class BookDto {
	
//	----------------------------- field S -----------------------------
//	concert
	private String concertSeq;
	private String concertName;
	
//	photo
	private String pseq;
	private String path;
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
	
//	----------------------------- getter & setter E -----------------------------

}
