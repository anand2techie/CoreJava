package com.fullstack.springboot.basics.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fullstak.springboot.basics.model.ShoppingCart;

@Service // this is similar to @COmponent, no major technical behavioral difference. only
			// it's a convention
public class ShoppingCartService {

	// assume that you have a map of user, List<ShoppingCart>

	public List<ShoppingCart> getShoppingCartDetails(String username) {
		Map<String, List<ShoppingCart>> shoppingCartMap = createShoppingCartDetailsMap();
		return shoppingCartMap.get(username);
	}

	// Database
	public Map<String, List<ShoppingCart>> createShoppingCartDetailsMap() {
		Map<String, List<ShoppingCart>> shoppingCartMap = new HashMap<String, List<ShoppingCart>>();

		List<ShoppingCart> user1ShoppingCartList = new ArrayList<ShoppingCart>();
		user1ShoppingCartList.add(new ShoppingCart("Pixel 2", "PIX002", 10000, new Date()));
		user1ShoppingCartList.add(new ShoppingCart("MI TV", "MITV001", 25000, new Date()));
		user1ShoppingCartList.add(new ShoppingCart("Apple IPhone", "IPhone001", 70000, new Date()));

		List<ShoppingCart> user2ShoppingCartList = new ArrayList<ShoppingCart>();
		user2ShoppingCartList.add(new ShoppingCart("Bike", "BIKE003", 10000, new Date()));
		user2ShoppingCartList.add(new ShoppingCart("MI TV", "MITV001", 25000, new Date()));
		user2ShoppingCartList.add(new ShoppingCart("Mac Laptop", "MACLaptop001", 70000, new Date()));

		List<ShoppingCart> user3ShoppingCartList = new ArrayList<ShoppingCart>();
		user3ShoppingCartList.add(new ShoppingCart("Pixel 2", "PIX002", 10000, new Date()));
		user3ShoppingCartList.add(new ShoppingCart("Gadget", "GADG001", 25000, new Date()));
		user3ShoppingCartList.add(new ShoppingCart("Charger", "CHARG002", 70000, new Date()));

		List<ShoppingCart> user4ShoppingCartList = new ArrayList<ShoppingCart>();
		user4ShoppingCartList.add(new ShoppingCart("Moto G", "MOTOG002", 10000, new Date()));
		user4ShoppingCartList.add(new ShoppingCart("MI TV", "MITV001", 25000, new Date()));
		user4ShoppingCartList.add(new ShoppingCart("Mac Laptop", "MacLaptop001", 70000, new Date()));

		shoppingCartMap.put("user1", user1ShoppingCartList);
		shoppingCartMap.put("user2", user2ShoppingCartList);
		shoppingCartMap.put("user3", user3ShoppingCartList);
		shoppingCartMap.put("user4", user4ShoppingCartList);
		return shoppingCartMap;
	}
}
