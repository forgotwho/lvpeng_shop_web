package com.lvpeng.customer.dal.model;

import org.springframework.data.annotation.Id;

public class OrderRefund {

	@Id
	private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
