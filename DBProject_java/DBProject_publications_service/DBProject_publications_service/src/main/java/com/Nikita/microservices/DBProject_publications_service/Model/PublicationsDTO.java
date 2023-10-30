package com.Nikita.microservices.DBProject_publications_service.Model;

public class PublicationsDTO {
	String name;
	String pub_type;
	boolean editable;
	boolean showConfirm;
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
