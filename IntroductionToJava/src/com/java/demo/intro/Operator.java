package com.java.demo.intro;

	
public class Operator {
	
	 public static void main(String[] args)
	 {
		 
	      int a = 10;	
	      int b = 11;	
	      int c = 0;

	      c = a & b;        
	      System.out.println("a & b = " + c );

	      c = a | b;       
	      System.out.println("a | b = " + c );

	      c = a ^ b;        
	      System.out.println("a ^ b = " + c );
	      
	      c = a << 2;      
	      System.out.println("a << 2 = " + c );

	      c = a >> 2;      
	      System.out.println("a >> 2  = " + c );

	      c = a >>> 2;      
	      System.out.println("a >>> 2 = " + c );
	 }
}