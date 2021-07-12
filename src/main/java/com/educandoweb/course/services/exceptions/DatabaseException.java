package com.educandoweb.course.services.exceptions;

public class DatabaseException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DatabaseException(String msg) {//contrutor para tratamento personalizado de exception database
		super(msg);
	}
}
