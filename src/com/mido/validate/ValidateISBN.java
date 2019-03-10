package com.mido.validate;

public class ValidateISBN {

	public boolean isOdd(int num) {

		if (num % 2 == 0)
			return true;

		return false;
	}
	
	public int getStringSize(String str) {
		return str.length();
	}

}
