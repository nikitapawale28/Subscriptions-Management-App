package com.Nikita.microservices.DBProject_customer_service.Model;

import jakarta.persistence.*;

@Entity
@Table(name ="customer")
public class Customer {
@Id
@Column(name = "Id_no")
int Id_no;
@Column(name = "Name")
String Name;
@Column(name = "Address")
String Address;


public Customer() {
	super();
	// TODO Auto-generated constructor stub
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
@Override
public String toString() {
	return "Customer [Id_no=" + Id_no + ", Name=" + Name + ", Address=" + Address + "]";
}


}
