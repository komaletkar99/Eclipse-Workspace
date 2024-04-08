package com.serializationdemo;

import java.io.Serializable;

public class dog extends Animal implements Serializable{
 int j=20;

 dog(){
	 System.out.println("Dog constructor called");
 }
}
