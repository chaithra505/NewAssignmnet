package com.sonata.dto;

public class ShoppingCartRequest {

	
	private int pId;
	private int quantity;

	ShoppingCartRequest(){}
	
	
	

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
