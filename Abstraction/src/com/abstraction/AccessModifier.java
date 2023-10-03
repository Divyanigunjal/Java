//wap to explain access modifier(private public protected, default) with example.
package com.abstraction;

//PUBLIC ACCESS MODIFIER
/*
class A
{
	private int a = 10;
	private void display()
	{
		System.out.println("Hello class A");
	}
}

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.display();//error bcoz of display is private method
	}
}
*/

//PUBLIC ACCESS MODIFIER
/*
class Son
{
	public int age=19;
	public void run()
	{
		System.out.println("Hello class son");
	}
}

public class AccessModifier {

	public static void main(String[] args) {
		Son s = new Son();
		s.run();
	}

}
*/

//PROTECTED ACCESS MODIFIER
/*
class New
{
	protected int n = 50;
	protected void display()
	{
		System.out.println("Hello class New");
	}
}

class New1 extends New
{
	public static void main(String[] args) {
	New n = new New();
	n.display();
	}
}
*/

//DEFAULT ACCESS MODOFIER
/*
class Default
{
	int a = 20;
}

class New extends Default
{
	public static void main(String[] args)
	{
		Default d = new Default();
		System.out.println(d.a);
	}
}
*/