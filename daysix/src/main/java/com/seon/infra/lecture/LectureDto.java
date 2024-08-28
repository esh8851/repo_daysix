package com.seon.infra.lecture;

import java.util.Date;

public class LectureDto {
	
	private String seq;
	private String lectureType;
	private String lectureName;
	private Integer lecturePrice;
	private String lectureTeacher;
	private Date regCourseStart;
	private Date regCourseFinal;
	private Date learningStart;
	private Date learningFinal;
	private String lecturePlace;
	private String lecturedetail;
	private Date lectureRegDateTime;
	private Date lectureModDateTime;
	private String hoewon_seq;
//	-------
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	
	public String getLectureType() {
		return lectureType;
	}
	public void setLectureType(String lectureType) {
		this.lectureType = lectureType;
	}
	public String getLectureName() {
		return lectureName;
	}
	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}
	public Integer getLecturePrice() {
		return lecturePrice;
	}
	public void setLecturePrice(Integer lecturePrice) {
		this.lecturePrice = lecturePrice;
	}
	public String getLectureTeacher() {
		return lectureTeacher;
	}
	public void setLectureTeacher(String lectureTeacher) {
		this.lectureTeacher = lectureTeacher;
	}
	public Date getRegCourseStart() {
		return regCourseStart;
	}
	public void setRegCourseStart(Date regCourseStart) {
		this.regCourseStart = regCourseStart;
	}
	public Date getRegCourseFinal() {
		return regCourseFinal;
	}
	public void setRegCourseFinal(Date regCourseFinal) {
		this.regCourseFinal = regCourseFinal;
	}
	public Date getLearningStart() {
		return learningStart;
	}
	public void setLearningStart(Date learningStart) {
		this.learningStart = learningStart;
	}
	public Date getLearningFinal() {
		return learningFinal;
	}
	public void setLearningFinal(Date learningFinal) {
		this.learningFinal = learningFinal;
	}
	public String getLecturePlace() {
		return lecturePlace;
	}
	public void setLecturePlace(String lecturePlace) {
		this.lecturePlace = lecturePlace;
	}
	public String getLecturedetail() {
		return lecturedetail;
	}
	public void setLecturedetail(String lecturedetail) {
		this.lecturedetail = lecturedetail;
	}
	public Date getLectureRegDateTime() {
		return lectureRegDateTime;
	}
	public void setLectureRegDateTime(Date lectureRegDateTime) {
		this.lectureRegDateTime = lectureRegDateTime;
	}
	public Date getLectureModDateTime() {
		return lectureModDateTime;
	}
	public void setLectureModDateTime(Date lectureModDateTime) {
		this.lectureModDateTime = lectureModDateTime;
	}
	public String getHoewon_seq() {
		return hoewon_seq;
	}
	public void setHoewon_seq(String hoewon_seq) {
		this.hoewon_seq = hoewon_seq;
	}
	

}
