package com.seon.infra.code;

import java.util.Date;

public class CodeDto {
	
	private String seq;
	private String cName;
	private Integer cUseNy;
	private Integer cOrder;
	private String cDesc;
	private Integer delNy;
	private Date cDateTime;
	private Date cDateTimeSvr;
	private String codeGroup_seq;
//	codegroup에서 가져올 데이터
	private String cgName;

//	-------
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Integer getcUseNy() {
		return cUseNy;
	}
	public void setcUseNy(Integer cUseNy) {
		this.cUseNy = cUseNy;
	}
	public Integer getcOrder() {
		return cOrder;
	}
	public void setcOrder(Integer cOrder) {
		this.cOrder = cOrder;
	}
	public String getcDesc() {
		return cDesc;
	}
	public void setcDesc(String cDesc) {
		this.cDesc = cDesc;
	}
	public Integer getDelNy() {
		return delNy;
	}
	public void setDelNy(Integer delNy) {
		this.delNy = delNy;
	}
	public Date getcDateTime() {
		return cDateTime;
	}
	public void setcDateTime(Date cDateTime) {
		this.cDateTime = cDateTime;
	}
	public Date getcDateTimeSvr() {
		return cDateTimeSvr;
	}
	public void setcDateTimeSvr(Date cDateTimeSvr) {
		this.cDateTimeSvr = cDateTimeSvr;
	}
	public String getCodeGroup_seq() {
		return codeGroup_seq;
	}
	public void setCodeGroup_seq(String codeGroup_seq) {
		this.codeGroup_seq = codeGroup_seq;
	}
//	-------
	public String getCgName() {
		return cgName;
	}
	public void setCgName(String cgName) {
		this.cgName = cgName;
	}

}
