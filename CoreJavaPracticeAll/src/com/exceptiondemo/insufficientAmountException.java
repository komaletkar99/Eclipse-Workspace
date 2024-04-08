package com.exceptiondemo;

public class insufficientAmountException extends Exception {
	public insufficientAmountException() {
		super();
	}
	public insufficientAmountException(String msg) {
		super(msg);
	}

}
