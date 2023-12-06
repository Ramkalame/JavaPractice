package com.java.practice.day3;

import java.io.IOException;

public class Main extends ParentClasswithException {
	
//	void printHello() throws IOException{
//		
//		
//		System.out.println("Exception Handling by throw keywords");
//		
//	}
	
	
//	void printHello() {
//		try {
//			int data = 100/0;
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//	}
//
//	
//	
//	public static void main(String[] args) {
//		
//		CheckedException parentreference = new Main();
//		
//		parentreference.printHello();
//		
//	}
	
	
	
	
	
	
	void msg(){
			
			System.out.println("Child class method");
		}
	
	public static void main(String[] args) {
		
		ParentClasswithException parentObject = new Main();
		
		parentObject.msg();
		
		
	}
}
