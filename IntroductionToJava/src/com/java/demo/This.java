package com.java.demo;

public class This {
	int a;
	int b;
	
	This()
	{
		this(10,20);
		System.out.println("Constructor");
		
	}
	This(int a, int b)
	{
		
		System.out.println("parameterized Constructor");
	}
	

	public static void main(String[] args) {
		This t=new This();
		
		

	}

}
