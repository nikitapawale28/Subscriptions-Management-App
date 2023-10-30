package com.Nikita.microservices.DBProject_customer_service.Model;

public class CustomerDTO {
int Id_no;
String Name;
String Address;
boolean editable;
boolean showConfirm;
public boolean isShowConfirm() {
	return showConfirm;
}
public void setShowConfirm(boolean showConfirm) {
	this.showConfirm = showConfirm;
}
public int getId_no() {
	return Id_no;
}
public void setId_no(int id_no) {
	Id_no = id_no;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public boolean isEditable() {
	return editable;
}
public void setEditable(boolean editable) {
	this.editable = editable;
}


}
