package com.Nikita.microservices.DBProject_subscriptions_service.Model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name ="subscription")
public class Subscription {
@Id
@Column(name = "sub_id")
String sub_id;
@Column(name = "cust_id")
String cust_id;
@Column(name = "start_date")
Date start_date;
@Column(name = "end_date")
Date end_date;
@Column(name = "price")
int price;
@Column(name = "sub_type")
int sub_type;

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



@Override
public String toString() {
	return "Subscription [sub_id=" + sub_id + ", cust_id=" + cust_id + ", start_date=" + start_date + ", end_date="
			+ end_date + ", price=" + price + ", sub_type=" + sub_type + "]";
}






}
