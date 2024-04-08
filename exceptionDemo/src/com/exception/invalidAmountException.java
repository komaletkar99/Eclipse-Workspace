package com.exception;

public class invalidAmountException extends Exception {
	invalidAmountException(){
		super();
	}

	invalidAmountException(String msg){
		super(msg);
	}
}
