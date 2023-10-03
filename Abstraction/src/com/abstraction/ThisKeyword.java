
//Implements the Example which explain this keyword in java
package com.abstraction;

class Parent
{
	int roll;
	void read()
	{
		System.out.println("Parent reading the book");
	}
	
}
class Child extends Parent
{
	public Child(int roll)
	{
		this.roll=roll;
	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		
		Child c = new Child(15);
		System.out.println("roll no ="+c.roll);
		
		
		
	}

}
