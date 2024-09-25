package com.wipro.vm.main;
import com.wipro.vm.entity.*;
import com.wipro.vm.service.*;


public class MainClass {
	public static void main(String[] args) throws Exception
	{
		// Creating the inventory
		Inventory[] stock = new Inventory[5];
		stock[0] = new Inventory("C101", "Lays Potato Chips", 10, 30.00);
		stock[1] = new Inventory("C102", "Water", 5, 20.00);
		stock[2] = new Inventory("C103", "Pepsi", 5, 15.00);
		stock[3] = new Inventory("C104", "Coke", 15, 15.00);
		stock[4] = new Inventory("C105", "DairyMilk Silk", 30, 45.00);
		Order.setStock(stock);
		// Item to place order
		String item = "Water";
		int quantity = 10;

		VendingMachineService vm = new VendingMachineService();
		System.out.println(vm.processOrder("OR101", item, quantity));
	}

}
