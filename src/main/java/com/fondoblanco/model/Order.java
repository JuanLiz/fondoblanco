package com.fondoblanco.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="orders")
public class Order {
	
	@Id
	private String id;
	private String userid;
	private String orderdate;
	private String orderstatus;
	private String orderdetailid;
	private String shipmentid;
	private double amount;
	private String paymethod;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	public String getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
	public String getOrderdetailid() {
		return orderdetailid;
	}
	public void setOrderdetailid(String orderdetailid) {
		this.orderdetailid = orderdetailid;
	}
	public String getShipmentid() {
		return shipmentid;
	}
	public void setShipmentid(String shipmentid) {
		this.shipmentid = shipmentid;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPaymethod() {
		return paymethod;
	}
	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}
	
	
	
	

}
