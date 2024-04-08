package com.exception.handling.practice;

public class InvalidAmounteException extends Exception {
	public InvalidAmounteException() {
		super();
	}

	public InvalidAmounteException(String msg) {
		super(msg);
	}
}
