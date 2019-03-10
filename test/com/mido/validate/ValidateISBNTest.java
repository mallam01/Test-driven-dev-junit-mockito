package com.mido.validate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidateISBNTest {

	@Test
	void isOdd() {
		ValidateISBN isbn = new ValidateISBN();
		boolean result = isbn.isOdd(4); 
		assertEquals(true, result);
	}
	
	@Test
	void isNotOdd() {
		ValidateISBN isbn = new ValidateISBN();
		boolean result = isbn.isOdd(9); 
		assertEquals(false, result);
	}
	
	@Test
	void getStringSize() {
		ValidateISBN isbn = new ValidateISBN();
		// Junit 5 exception handling (new syntax)
		Assertions.assertThrows(NullPointerException.class, () -> {
			int result = isbn.getStringSize(null);
		    });
	}
	

}
