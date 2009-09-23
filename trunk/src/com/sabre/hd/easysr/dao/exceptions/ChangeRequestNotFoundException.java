package com.sabre.hd.easysr.dao.exceptions;

public class ChangeRequestNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public ChangeRequestNotFoundException(){
		
	}
	
	public ChangeRequestNotFoundException(String message){
		super(message);
	}
	
	public ChangeRequestNotFoundException(Throwable t)
	{
		super(t);
	}

	public ChangeRequestNotFoundException(String msg, Throwable t){
		super(msg, t);
	}

}
