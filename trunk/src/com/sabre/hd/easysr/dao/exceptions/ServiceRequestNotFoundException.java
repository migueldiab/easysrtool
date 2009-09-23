package com.sabre.hd.easysr.dao.exceptions;

public class ServiceRequestNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public ServiceRequestNotFoundException(){
		
	}
	
	public ServiceRequestNotFoundException(String message){
		super(message);
	}
	
	public ServiceRequestNotFoundException(Throwable t)
	{
		super(t);
	}

	public ServiceRequestNotFoundException(String msg, Throwable t){
		super(msg, t);
	}

}
