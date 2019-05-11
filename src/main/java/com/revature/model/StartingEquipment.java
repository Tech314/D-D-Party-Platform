package com.revature.model;


public class StartingEquipment {
	
	private Integer quantity;
	private Item[] item;
	
	public StartingEquipment() {}
	
	public StartingEquipment(Integer quantity, Item[] item) {
		super();
		this.quantity = quantity;
		this.item = item;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Item[] getItem() {
		return item;
	}
	public void setItem(Item[] item) {
		this.item = item;
	}

}
