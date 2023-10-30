package com.Nikita.microservices.DBProject_subscriptions_service.Model;

import java.util.Date;



public class SubscriptionDTO {

	String sub_id;
	String cust_id;
	Date start_date;
	Date end_date;
	int price;
	int sub_type;
	boolean editable;
	boolean showConfirm;
	public String getSub_id() {
		return sub_id;
	}
	public void setSub_id(String sub_id) {
		this.sub_id = sub_id;
	}
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSub_type() {
		return sub_type;
	}
	public void setSub_type(int sub_type) {
		this.sub_type = sub_type;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	public boolean isShowConfirm() {
		return showConfirm;
	}
	public void setShowConfirm(boolean showConfirm) {
		this.showConfirm = showConfirm;
	}
	
	
}
