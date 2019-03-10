package com.mido.validate;

public class StockManager {

	public ExternalISBNBDataService service;

	
	
	public ExternalISBNBDataService getService() {
		return service;
	}



	public void setService(ExternalISBNBDataService service) {
		this.service = service;
	}



	public String getLocatorCode(String isbn) {
		return service.lookup(isbn).getTitle(); 
	}
}
