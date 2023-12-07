package com.java.practice.day4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		NullPointerExceptionExample o1 = new NullPointerExceptionExample();
		
		o1.setAge(0);
		o1.setName(" ram kalame");
		o1.setGender(null);
		
		try {
			
			int object1Age = o1.getAge();
			String object1Name = o1.getName();
			String object1gender = o1.getGender();
			
			System.out.println(object1Age + object1Name +  object1gender);
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
		
		
		System.out.println("Rest of the code");
		

	}

}
