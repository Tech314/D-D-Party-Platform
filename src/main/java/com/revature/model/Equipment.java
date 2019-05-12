package com.revature.model;

public class Equipment {
	
	private Integer quantity;
	private Item item;
	
	public Equipment() {}
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}

	public Equipment(Integer quantity, Item item) {
		super();
		this.quantity = quantity;
		this.item = item;
	}

	@Override
	public String toString() {
		return "Equipment [quantity=" + quantity + ", item=" + item + "]";
	}

	
	
}
