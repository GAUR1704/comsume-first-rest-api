package com.prowings.myapp.exception;

public class NotFoundException extends RuntimeException{

	
	private static final long serialVersionUID = 1106691738197798250L;

	public NotFoundException() {
		super();
	}

	public NotFoundException(String message) {
		super(message);
	}
	
	

}
