package com.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("anuja");
		
		StringBuffer sb1 = new StringBuffer("tauja");
//	    System.out.println(sb1==sb);
//	    System.out.println(sb1.equals(sb));
//	    System.out.println(sb.length());
	    System.out.println(sb1.capacity());
//	    System.out.println(sb.charAt(4));
//	    System.out.println(sb1.compareTo(sb));
//		System.out.println(sb);

	    sb1.trimToSize();
	   System.out.println( sb1.length());
	}

}
