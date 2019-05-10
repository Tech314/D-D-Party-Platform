package com.revature.model;

<<<<<<< HEAD

=======
>>>>>>> 0fac3f4fa8662bd7ed7e0511ab2dd6f671f8eef7
public class StartingEquipment {
	
	private Integer quantity;
	private Item item;
	
	public StartingEquipment() {}
	
	public StartingEquipment(Integer quantity, Item item) {
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
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}

}
