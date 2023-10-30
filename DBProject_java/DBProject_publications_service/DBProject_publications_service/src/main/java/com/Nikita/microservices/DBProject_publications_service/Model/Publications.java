package com.Nikita.microservices.DBProject_publications_service.Model;

import jakarta.persistence.*;

@Entity
@Table(name ="publications")
public class Publications {
@Id
@Column(name = "name")
String name;
@Column(name = "pub_type")
String pub_type;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPub_type() {
	return pub_type;
}
public void setPub_type(String pub_type) {
	this.pub_type = pub_type;
}


@Override
public String toString() {
	return "Publications [name=" + name + ", pub_type=" + pub_type + "]";
}




}
