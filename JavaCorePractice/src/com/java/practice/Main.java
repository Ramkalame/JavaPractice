package com.java.practice;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		int b = 0;
		
		try {
			int c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("There is eception ouccured " + e);
		}
		
		
	}

}
