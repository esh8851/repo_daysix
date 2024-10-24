package com.seon.infra.reply;

import java.util.Date;

public class ReplyDto {
	
	private String replySeq;
	private String replyText;
	private Date replyDateTime;
	private String member_mmSeq;
	private String concert_concertSeq;
	
	
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
	
	

}
