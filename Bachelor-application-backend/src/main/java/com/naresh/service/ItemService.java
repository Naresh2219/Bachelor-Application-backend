package com.naresh.service;

import org.springframework.stereotype.Service;

import com.naresh.model.Expense;

@Service
public class ItemService {

	public Expense saveItem(Expense items) {
		return items;
	}
	
	public double calculateItemPrice(double initialPrice, int n, double itemQuantity) {
	    double itemPrice = initialPrice;
	    for (int i = 0; i < n; i++) {
	        itemPrice = itemPrice * itemQuantity;
	    }
	    return itemPrice;
	}

}
