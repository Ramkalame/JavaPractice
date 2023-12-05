package com.java.practice;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.*;

import com.java.practice.model.CheckedException;
import com.java.practice.model.UserDefineException;

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
		
	
//	public static void newMainClass(int age) {
//		
//		if(age<18) {
//			
//			throw new ArithmeticException("Person is not eligible to vote");
//			
//		}
//		else {
//			System.out.println("person is eligible to vote !");
//		}
//		
//		
//		
//	}
	
	
//	public static void main(String[] args) {
//		
////		newMainClass(15);
//		
//		try {
//			
//			CheckedException obj = new CheckedException();
//			
//			obj.method();
//			
//		} catch (FileNotFoundException e) {
//			// TODO: handle exception
//			
////			System.out.println(e);
//			e.printStackTrace();
//		}
//		System.out.println("rest of the code");
//	}
	
	
	
	public static void main(String[] args) {
		
		try {
			
//			throw new UserDefineException("this is coustom exception class");
			int data = 100/0;
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
			e.getStackTrace();
			e.printStackTrace();
			e.fillInStackTrace();
		}
		
	}
		

}
