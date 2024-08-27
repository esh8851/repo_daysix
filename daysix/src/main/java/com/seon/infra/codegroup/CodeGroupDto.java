package com.seon.infra.codegroup;

import java.util.Date;

public class CodeGroupDto {
	
	private String seq;
	private String cgName;
	private Integer cgUseNy;
	private Integer cgOrder;
	private String cgDesc;
	private Integer delNy;
	private Date cgDateTime;
	private Date cgDateTimeSvr;
//	-------
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getCgName() {
		return cgName;
	}
	public void setCgName(String cgName) {
		this.cgName = cgName;
	}
	public Integer getCgUseNy() {
		return cgUseNy;
	}
	public void setCgUseNy(Integer cgUseNy) {
		this.cgUseNy = cgUseNy;
	}
	public Integer getCgOrder() {
		return cgOrder;
	}
	public void setCgOrder(Integer cgOrder) {
		this.cgOrder = cgOrder;
	}
	public String getCgDesc() {
		return cgDesc;
	}
	public void setCgDesc(String cgDesc) {
		this.cgDesc = cgDesc;
	}
	public Integer getDelNy() {
		return delNy;
	}
	public void setDelNy(Integer delNy) {
		this.delNy = delNy;
	}
	public Date getCgDateTime() {
		return cgDateTime;
	}
	public void setCgDateTime(Date cgDateTime) {
		this.cgDateTime = cgDateTime;
	}
	public Date getCgDateTimeSvr() {
		return cgDateTimeSvr;
	}
	public void setCgDateTimeSvr(Date cgDateTimeSvr) {
		this.cgDateTimeSvr = cgDateTimeSvr;
	}
	
	
}
