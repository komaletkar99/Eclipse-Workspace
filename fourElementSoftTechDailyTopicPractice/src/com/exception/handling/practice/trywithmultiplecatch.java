package com.exception.handling.practice;

import java.io.IOException;

public class trywithmultiplecatch {

	public static void main(String[] args) {
		try {
			String s = null;
			s.length();
			System.out.println(s);
			//System.out.println(10/0);
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBounds Exception");
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException Exception");
		}
		catch (Throwable e) {
			System.out.println("Parent class Exception");
		}
		finally {
			System.out.println("finally block executed");
		}
	}

}
