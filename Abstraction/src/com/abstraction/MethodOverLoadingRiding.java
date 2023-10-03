//Write a program which implemets method overlading and overriding programmatically. with real world example

package com.abstraction;

class Addition
{
	public void add()
	{
		System.out.println();
	}
	public double add(double a,double b)
	{
		return a+b;
	}
	public void add(int a,int b,double c)
	{
		System.out.println(a+b+c);
	}
}
class B1 extends Addition
{
	public void add()
	{
		System.out.println("Non Parameterized constructor in Derived class");
		
	}
}


public class MethodOverLoadingRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B1 b = new B1();
		b.add();
		b.add(10.6,20.7);
		b.add(10,20,30);

	}

}
