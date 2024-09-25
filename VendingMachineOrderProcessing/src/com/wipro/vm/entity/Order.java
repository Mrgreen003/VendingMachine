package com.wipro.vm.entity;

public class Order {
	public static Inventory [] stock;
	String orderId;
	String item;
	int orderQuantity;
	double totalAmount;
	
	public static Inventory[] getStock() {
		return stock;
	}
	public static void setStock(Inventory[] stock) {
		Order.stock = stock;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public void updateStock(String itemId,int quantity)
	{ int i=0;
	  do
	  { 
		 if(stock[i].itemId==itemId)
		 {
			 stock[i].quantity-=quantity;
			 break;
		 }
		 i++;
	  }while(i<=stock.length);
		
	}
	public void calculateBill()
	{
		int i=0;
		  do
		  { 
			 if(stock[i].itemName==item)
			 {
				this.totalAmount= stock[i].price*this.orderQuantity;
				updateStock(stock[i].itemId,this.orderQuantity);
				break;
			 }
			 i++;
		  }while(i<=stock.length);
		  
		  
	}

}
