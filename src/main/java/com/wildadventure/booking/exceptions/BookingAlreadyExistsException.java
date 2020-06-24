package com.wildadventure.booking.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class BookingAlreadyExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookingAlreadyExistsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	

}
