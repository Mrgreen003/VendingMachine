package com.wipro.vm.service;
import com.wipro.vm.entity.*;
import com.wipro.vm.util.*;

public class VendingMachineService extends Order {
	
	public String checkInventoryStatus(String item,int orderQuantity) throws ItemOutOfStockException
	{
	  int i=0;
	  do
	  {
		  if(Order.stock[i].getItemName()==item)
		  {
			  if(orderQuantity>Order.stock[i].getQuantity())
			  {
				  throw new ItemOutOfStockException();
			  }
			  else if(orderQuantity<=Order.stock[i].getQuantity())
			  {
				  return "Item in Stock";
			  }
		  }
	  }while(i<Order.stock.length);
	  return null;}


public String validateData(String orderId,String item,int orderQuantity) throws InvalidOrderException
{
	if (orderId==null) {
		throw new InvalidOrderException("null");
	}
	else if(orderId.length()!=5) {
		throw new InvalidOrderException("length");
	}
	else if(orderId.charAt(0)!='O'||orderId.charAt(1)!='R') {
		throw new InvalidOrderException("or");
		
	}
	else if(orderId.substring(0,2)=="OR")
  	{
		try {
			  int n=Integer.parseInt(orderId.substring(2, 5));
		  }
		  catch(Exception E){
			  System.out.print(E);
			   throw new InvalidOrderException("101");
			   
		  }
  	}
	
	else if(orderQuantity<0 && orderQuantity>10)
    {
	  throw new InvalidOrderException("neg");
    }
	else {
		try {
			if(checkInventoryStatus(item,orderQuantity)=="Item in Stock")
			{
				return "Valid";
			}
		}
		catch(ItemOutOfStockException e)
		{
			return e.toString();
		}
		
	}return null;
	
}
public String generateBill(Order order)
{
	order.calculateBill();
	return "Order id :"+order.getOrderId()+"\nAmount:Rs."+order.getTotalAmount();
	 
}
public String processOrder(String orderId,String item,int orderQuantity)
{
	try {
		if(validateData(orderId,item,orderQuantity)=="Valid")
		{
			Order order=new Order();
			order.setOrderId(orderId);
			order.setItem(item);
			order.setOrderQuantity(orderQuantity);
			return generateBill(order);
		}}
	catch(InvalidOrderException e)
	{
		return e.getMessage();
	}
	return null;
	}

}