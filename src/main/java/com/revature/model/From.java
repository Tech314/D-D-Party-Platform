package com.revature.model;

<<<<<<< HEAD

=======
>>>>>>> 0fac3f4fa8662bd7ed7e0511ab2dd6f671f8eef7
public class From {

	private String name;
	private String url;
	private Integer quantity;
	private Item[] item;
	
	public From() {}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
<<<<<<< HEAD
=======
	
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
	public From() {
		super();
		// TODO Auto-generated constructor stub
	}
>>>>>>> 0fac3f4fa8662bd7ed7e0511ab2dd6f671f8eef7
	public From(String name, String url, Integer quantity, Item[] item) {
		super();
		this.name = name;
		this.url = url;
		this.quantity = quantity;
		this.item = item;
	}
	
	
<<<<<<< HEAD
	
=======
>>>>>>> 0fac3f4fa8662bd7ed7e0511ab2dd6f671f8eef7
}