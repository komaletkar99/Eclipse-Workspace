package com.fourelementsofttechDailyPractice;

public interface demoInterface {
	public int a=10;
	public void add();
	public void mul();
	public void sub();
	public void div();
	
	
}

abstract class demoabstract implements demoInterface{

	@Override
	public abstract void add();

	@Override
	public abstract void mul();

	@Override
	public void sub() {
		System.out.println("substraction method");
		
	}

	@Override
	public void div() {
		System.out.println("division method");
		
	}
	
}

class test extends demoabstract{
	@Override
	public void add() {
		System.out.println("Addition method");
		
	}

	@Override
	public void mul() {
		System.out.println("multiplication method");
		
	}
}

