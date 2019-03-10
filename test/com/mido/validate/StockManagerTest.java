package com.mido.validate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StockManagerTest {

	@Test
	void test() {
		
		ExternalISBNBDataService dataService = new ExternalISBNBDataService() {
			
			@Override
			public Book lookup(String isbn) {
				return new Book(isbn, "Java" , "mido");
			}
		};
		
		StockManager stockManager = new StockManager();
		stockManager.setService(dataService);
		String result = stockManager.getLocatorCode("123");
		assertEquals("Java", result);
		
	}

}
