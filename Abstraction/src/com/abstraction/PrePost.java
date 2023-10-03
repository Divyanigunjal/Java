//Q2.Write a program which will explain Pre/Post increment and Pre/Post Decrement operator
package com.abstraction;
public class PrePost {

	public static void main(String[] args) {
		int a=20,b,c,d,e;
		b=++a;
		c=a++;
		d=a--;
		e=--a;
		System.out.println("Pre increment"+b);
		System.out.println("Pre increment"+c);
		System.out.println("Pre increment"+d);
		System.out.println("Pre increment"+e);
	}
}

