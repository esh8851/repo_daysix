package com.seon.infra.restaurant;

import java.util.Date;

public class RestaurantDto {
	
	private String seq;
	private String restaurantType;
	private String restaurantName;
	private Date restaurantOpenTime;
	private Date restaurantCloseTime;
	private String restaurantPhone;
	private String restaurantHomePage;
	private Integer restaurantParkingNy;
	private Integer restaurantRegNy;
	private Integer restaurantCorkageNy;
	private String restaurantIntroText;
	private Date restaurantRegDateTime;
	private Date restaurantModDateTime;
//	-------
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getRestaurantType() {
		return restaurantType;
	}
	public void setRestaurantType(String restaurantType) {
		this.restaurantType = restaurantType;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public Date getRestaurantOpenTime() {
		return restaurantOpenTime;
	}
	public void setRestaurantOpenTime(Date restaurantOpenTime) {
		this.restaurantOpenTime = restaurantOpenTime;
	}
	public Date getRestaurantCloseTime() {
		return restaurantCloseTime;
	}
	public void setRestaurantCloseTime(Date restaurantCloseTime) {
		this.restaurantCloseTime = restaurantCloseTime;
	}
	public String getRestaurantPhone() {
		return restaurantPhone;
	}
	public void setRestaurantPhone(String restaurantPhone) {
		this.restaurantPhone = restaurantPhone;
	}
	public String getRestaurantHomePage() {
		return restaurantHomePage;
	}
	public void setRestaurantHomePage(String restaurantHomePage) {
		this.restaurantHomePage = restaurantHomePage;
	}
	public Integer getRestaurantParkingNy() {
		return restaurantParkingNy;
	}
	public void setRestaurantParkingNy(Integer restaurantParkingNy) {
		this.restaurantParkingNy = restaurantParkingNy;
	}
	public Integer getRestaurantRegNy() {
		return restaurantRegNy;
	}
	public void setRestaurantRegNy(Integer restaurantRegNy) {
		this.restaurantRegNy = restaurantRegNy;
	}
	public Integer getRestaurantCorkageNy() {
		return restaurantCorkageNy;
	}
	public void setRestaurantCorkageNy(Integer restaurantCorkageNy) {
		this.restaurantCorkageNy = restaurantCorkageNy;
	}
	public String getRestaurantIntroText() {
		return restaurantIntroText;
	}
	public void setRestaurantIntroText(String restaurantIntroText) {
		this.restaurantIntroText = restaurantIntroText;
	}
	public Date getRestaurantRegDateTime() {
		return restaurantRegDateTime;
	}
	public void setRestaurantRegDateTime(Date restaurantRegDateTime) {
		this.restaurantRegDateTime = restaurantRegDateTime;
	}
	public Date getRestaurantModDateTime() {
		return restaurantModDateTime;
	}
	public void setRestaurantModDateTime(Date restaurantModDateTime) {
		this.restaurantModDateTime = restaurantModDateTime;
	}
	
	
}
