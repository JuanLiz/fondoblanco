package com.fondoblanco.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "ordersdetails")
public class OrderDetail {

	@Id
	private String id;
	private List<Item> itemDetail;
	private double totalPrice;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Item> getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(List<Item> itemDetail) {
		this.itemDetail = itemDetail;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
