package com.java.practice;
import java.util.*;

public class Main {
	
//	public static void main(String[] args) {
		
//		  try{    
//			    int a[]=new int[5];    
//			    a[5]=30/0;    
//			   }    
//		  	   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}    
//			   catch(ArithmeticException e){System.out.println("task1 is completed");}    
//		  	   catch(Exception e){System.out.println("common task completed");}    
//			   System.out.println("rest of the code...");    
//		
//		
//	}
		
	
	public static void newMainClass(int age) {
		
		if(age<18) {
			
			throw new ArithmeticException("Person is not eligible to vote");
			
		}
		else {
			System.out.println("person is eligible to vote !");
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		newMainClass(15);
		System.out.println("rest of tthe code");
	}
		

}
