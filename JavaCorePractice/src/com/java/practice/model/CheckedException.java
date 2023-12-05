package com.java.practice.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
	
	
	public static void method() throws FileNotFoundException{
		
		FileReader file = new FileReader("D:\\sqlcmd.txt");
		BufferedReader fileInput = new BufferedReader(file);
		
		
		throw new FileNotFoundException();
		
	}

}
