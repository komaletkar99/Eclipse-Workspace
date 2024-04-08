package com.Exception.handlin.practice;

public interface Bank {
public void depositeAmount(double amount) throws InvalidAmountException;
public double WithdrawAmount(double amount) throws InsufficientAmountException;
public void balanceEnquiry();


}
