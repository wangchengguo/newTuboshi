package com.liyou.exception;

public class BargainException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BargainException() {

		super();
	}

	public BargainException(String msg) {

		super(msg);
	}
	
	public BargainException(String msg, Throwable cause) {

		super(msg, cause);
	}

	public BargainException(Throwable cause) {

		super(cause);
	}
}
