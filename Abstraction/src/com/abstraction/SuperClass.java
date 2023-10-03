//Implements the Example which explain super keyword in java

package com.string;

class Base
{
	public Base()
	{
		
	}
	void fun()
	{
		System.out.println("Fun method of Base class");
	}
	
}
class Derived extends Base
{
	
	void gun()
	{
		super.fun();
		System.out.println("Gun method of Base class");
	}
}
public class SuperClass {

	public static void main(String[] args) {
		
		Derived d = new Derived();
		d.gun();
		
		
	}

}
