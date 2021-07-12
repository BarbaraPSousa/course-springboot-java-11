package com.educandoweb.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) { //construtor com obj id
		super("Resource not found. Id " + id); // msg mas id que não foi encontrado
	}
	

}
