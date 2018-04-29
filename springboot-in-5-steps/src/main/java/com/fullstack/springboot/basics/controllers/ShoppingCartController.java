package com.fullstack.springboot.basics.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.springboot.basics.service.ShoppingCartService;
import com.fullstak.springboot.basics.model.ShoppingCart;

@RestController // you're exposing all your resources to the client
public class ShoppingCartController {

	@Autowired
	private ShoppingCartService shoppingCartService;// null

	// get back user5 details to view it in the client side.
	// if you want to use this from the front-end, you want to do a url mapping
	@GetMapping("/getShoppingCartProducts/{username}")
	public List<ShoppingCart> getProductsFromShoppingCartBasedOnUser(@PathVariable("username") String username) {
		return shoppingCartService.getShoppingCartDetails(username);// NPE due to shoppingCartService is null
	}

	// user1,user2,user3,user4
	@PostMapping("/addProducts")
	public void addProductsToShoppingCart() {
		// add user5 details to the map
	}

}
