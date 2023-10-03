/*
package com.java.demo.intro;
*/


//Single inheritance
/*
class Parent {
	String pname;
	
	void parentmethod()
	{
		System.out.println("Parent");
	
	}
}
class Child extends Parent{
	String cname;
	
	void childmethod()
	{
		System.out.println("Child");
	}
}



public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.childmethod();
		c.parentmethod();
	}
*/

//Multilevel Inheritance
/*
class GrandParent {
	String Gpname;
	
	void Grandparentmethod()
	{
		System.out.println("GrandParent");
	
	}
}

class Parent extends GrandParent {
	String pname;
	
	void parentmethod()
	{
		System.out.println("Parent");
	
	}
}
class Child extends Parent{
	String cname;
	
	void childmethod()
	{
		System.out.println("Child");
	}
}



public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.childmethod();
		c.parentmethod();
		c.Grandparentmethod();
	}
		
*/

//Hirarchucal Inheritance
/*
class GrandParent {
	String Gpname;
	
	void Grandparentmethod()
	{
		System.out.println("GrandParent");
	
	}
}

class Parent1 extends GrandParent {
	String pname;
	
	void parent1method()
	{
		System.out.println("Parent1");
	
	}
}

class Parent2 extends GrandParent {
	String pname;
	
	void parent2method()
	{
		System.out.println("Parent2");
	
	}
}

class Child extends Parent2{
	String cname;
	
	void childmethod()
	{
		System.out.println("Child");
	}
}



public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.childmethod();
		c.parent2method();
		c.Grandparentmethod();
	}
*/

//hybrid inheritance

/*
class Grandparent
{
	String gName;
	void GrandParentMethod()         
	{
		System.out.println(gName);
	}
	
}

class Parent1 extends Grandparent
{
	String p1Name;
	
	void Parent1Method()           
	{
		System.out.println(p1Name);
	}
}
class Parent2 extends Grandparent
{
	String p2Name;
	
	void Parent2Method()           
	{
		System.out.println(p2Name);
	}
}
class child extends Parent1
{
String c1Name;
	
	void child1Method()           // 4 feactures
	{
		System.out.println(c1Name);
	}
}
class child2 extends Parent2
{
String c2Name;
	
	void child2Method()           // 4 features
	{
		System.out.println(c2Name);
	}
}

public class inheritance {

	public static void main(String[] args) {
		
		child2 c2=new child2();
		
		child c1=new child();
	
		Parent1 p1=new Parent1();

        Parent2 p2=new Parent2();

	}

}
*/

}
