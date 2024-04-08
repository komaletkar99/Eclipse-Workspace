package com.blocks;

public class blockDemo {
	static{
		System.out.println("static block 1 is executed");
		
	}
	{
		System.out.println("instance block 1 is executed");
		
	}

	static{
		System.out.println("static block 2 is executed");
		
	}
	{
		System.out.println("instance block 2 is executed");
		
	}
	static{
		System.out.println("static block 3 is executed");
		
	}
	{
	System.out.println("instance block 3 is executed");
	}
	public static void main(String[] args) {
		
		blockDemo d = new blockDemo();
		

	}

}
